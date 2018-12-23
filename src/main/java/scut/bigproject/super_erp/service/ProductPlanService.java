package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.returnentity.Result;

public interface ProductPlanService {
    Result findProductPlanByDate(String date);

    Result findAllUncompletePurchasePlan();

    Result finishPurchasePlan(int id);
}
