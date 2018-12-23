package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;

public interface ProductRecordService {
    /**
     * 对应模块3，生产记录管理模块
     */
    Result insertProductionRecord(ProductionRecord productionRecord);
    Result findProductionRecord(int id);
}
