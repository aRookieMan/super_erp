package scut.bigproject.super_erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.MaterialInventoryRecord;
import scut.bigproject.super_erp.entity.ProductInventoryRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.InventoryMapper;
import scut.bigproject.super_erp.service.InventoryService;
import scut.bigproject.super_erp.util.ResultUtil;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private InventoryMapper inventoryMapper;

    @Override
    public Result findMaterialInventoryRecordByDate(String date) {
        List<MaterialInventoryRecord> materialInventoryRecord = inventoryMapper.findMaterialInventoryRecordByDate(date);
        return ResultUtil.goodResultReturner("success", materialInventoryRecord);
    }

    @Override
    public Result insertMaterialInventoryRecord(MaterialInventoryRecord materialInventoryRecord) {
        try{
            inventoryMapper.insertMaterialInventoryRecord(materialInventoryRecord);
            return ResultUtil.goodResultReturner("insertMaterialInventoryRecord success", 0);
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.badResultReturner("insertMaterialInventoryRecord failed");
        }

    }

    @Override
    public Result findProductInventoryRecordByDate(String date) {
        List<ProductInventoryRecord> productInventoryRecord = inventoryMapper.findProductInventoryRecordByDate(date);
        return ResultUtil.goodResultReturner("success", productInventoryRecord);
    }

    @Override
    public Result insertProductInventoryRecord(ProductInventoryRecord productInventoryRecord){
        try{
            inventoryMapper.insertProductInventoryRecord(productInventoryRecord);
            return ResultUtil.goodResultReturner("insertProductInventoryRecord success.", 0);
        } catch (Exception e){
            e.printStackTrace();
            return ResultUtil.badResultReturner("insertProductInventoryRecord failed.");
        }
    }
}
