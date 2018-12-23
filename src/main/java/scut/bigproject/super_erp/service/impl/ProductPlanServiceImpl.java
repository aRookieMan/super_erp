package scut.bigproject.super_erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.ProductionPlanMapper;
import scut.bigproject.super_erp.mapper.PurchasePlanMapper;
import scut.bigproject.super_erp.service.ProductPlanService;
import scut.bigproject.super_erp.util.ResultUtil;

@Service
public class ProductPlanServiceImpl implements ProductPlanService{
    @Autowired
    ProductionPlanMapper productionPlanMapper;
    @Autowired
    PurchasePlanMapper purchasePlanMapper;

    @Override
    public Result findProductPlanByDate(String date) {
        return ResultUtil.goodResultReturner(productionPlanMapper.findProductionPlanByDate(date));
    }

    @Override
    public Result findAllUncompletePurchasePlan() {
        return ResultUtil.goodResultReturner(purchasePlanMapper.findAllUncompletePurchasePlan());
    }

    @Override
    public Result finishPurchasePlan(int id) {
        return ResultUtil.goodResultReturner(purchasePlanMapper.finishPurchasePlan(id));
    }
}
