package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.MaterialInventoryRecord;
import scut.bigproject.super_erp.entity.ProductInventoryRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;

public interface InventoryService {
    /**
     * 对应模块5，库存管理模块
     */
    Result findMaterialInventoryRecordByDate(String date);
    Result insertMaterialInventoryRecord(MaterialInventoryRecord materialInventoryRecord);
    Result findProductInventoryRecordByDate(String date);
    Result insertProductInventoryRecord(ProductInventoryRecord productInventoryRecord);
}
