package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.WorklineRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;

import java.util.List;

public interface ProductRecordService {
    /**
     * 对应模块3，生产记录管理模块
     */
    Result insertProductionRecord(ProductionRecord productionRecord, List<WorklineRecord> worklineRecords);
    Result findProductionRecordById(int id);
    Result findProductionRecordByDate(String recordDate);
}
