package scut.bigproject.super_erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.MaterialRecord;
import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.WorklineRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.ProductRecordMapper;
import scut.bigproject.super_erp.service.ProductRecordService;
import scut.bigproject.super_erp.util.ResultUtil;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductionRecordServiceImpl implements ProductRecordService{
    @Autowired
    private ProductRecordMapper productRecordMapper;

    @Override
    public Result insertProductionRecord(ProductionRecord productionRecord, List<WorklineRecord> worklineRecords){
        try{
            productRecordMapper.insertProductionRecord(productionRecord);
            for(WorklineRecord worklineRecord : worklineRecords){
                worklineRecord.setProductionRecordId(productionRecord.getId());
                productRecordMapper.insertWorklineRecord(worklineRecord);
                for (MaterialRecord materialRecord : worklineRecord.getMaterialRecords()){
                    materialRecord.setWorklineRecordId(worklineRecord.getId());
                    productRecordMapper.insertMaterialRecord(materialRecord);
                }
            }
            return ResultUtil.goodResultReturner("insert productionRecord success.");
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.badResultReturner("insert productionRecord failed.");
        }
    }

    @Override
    public Result findProductionRecordById(int id){
        ProductionRecord productionRecord = productRecordMapper.findProductionRecordById(id);
        ArrayList<WorklineRecord> worklineRecords = productRecordMapper.getWorklineRecords(id);
        for(WorklineRecord worklineRecord : worklineRecords){
            int worklineRecordId = worklineRecord.getId();
            worklineRecord.setMaterialRecords(productRecordMapper.getMaterialRecords(worklineRecordId));
        }
        productionRecord.setWorklineRecords(worklineRecords);
        return ResultUtil.goodResultReturner(productionRecord);
    }

    @Override
    public Result findProductionRecordByDate(String recordDate){
        ProductionRecord productionRecord = productRecordMapper.findProductionRecordByDate(recordDate);
        ArrayList<WorklineRecord> worklineRecords = productRecordMapper.getWorklineRecords(productionRecord.getId());
        for(WorklineRecord worklineRecord : worklineRecords){
            int worklineRecordId = worklineRecord.getId();
            worklineRecord.setMaterialRecords(productRecordMapper.getMaterialRecords(worklineRecordId));
        }
        productionRecord.setWorklineRecords(worklineRecords);
        return ResultUtil.goodResultReturner(productionRecord);
    }
}
