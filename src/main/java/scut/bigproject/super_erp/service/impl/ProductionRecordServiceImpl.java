package scut.bigproject.super_erp.service.impl;

import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.WorklineRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.ProductRecordMapper;
import scut.bigproject.super_erp.service.ProductRecordService;
import scut.bigproject.super_erp.util.ResultUtil;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class ProductionRecordServiceImpl implements ProductRecordService{
    @Resource
    private ProductRecordMapper productRecordMapper;

    @Override
    public Result insertProductionRecord(ProductionRecord productionRecord){
        return null;
    }

    @Override
    public Result findProductionRecord(int id){
        ProductionRecord productionRecord = productRecordMapper.findProductionRecord(id);
        ArrayList<WorklineRecord> worklineRecords = productRecordMapper.getWorklineRecords(id);
        for(int i=0; i<worklineRecords.size(); i++){
            int worklineRecordId = worklineRecords.get(i).getId();
            worklineRecords.get(i).setMaterialRecords(productRecordMapper.getMaterialRecords(worklineRecordId));
        }
        productionRecord.setWorklineRecords(worklineRecords);
        return ResultUtil.goodResultReturner(productionRecord);
    }
}
