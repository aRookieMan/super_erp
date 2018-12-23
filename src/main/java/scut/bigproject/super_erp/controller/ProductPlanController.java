package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import scut.bigproject.super_erp.service.ProductPlanService;

@Controller
@RequestMapping(value = "/productPlan")
public class ProductPlanController {
    @Autowired
    ProductPlanService productPlanService;

    /**
     * 按照日期查看生产计划
     * @param date
     * @return
     */
    @RequestMapping(value = "/findProductPlanByDate", method = RequestMethod.GET)
    @ResponseBody
    public Object findProductPlanByDate(@RequestParam(value = "date", required = true) String date){
        return productPlanService.findProductPlanByDate(date);
    }

    /***
     * 查看未完成采购计划
     * @return
     */
    @RequestMapping(value = "/findAllUncompletePurchasePlan", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllUncompletePurchasePlan( ){
        return productPlanService.findAllUncompletePurchasePlan( );
    }

    /***
     * 完成采购计划
     * @param id
     * @return
     */
    @RequestMapping(value = "/finishPurchasePlan", method = RequestMethod.GET)
    @ResponseBody
    public Object finishPurchasePlan(@RequestParam(value = "id", required = true) int id){
        return productPlanService.finishPurchasePlan(id);
    }
}
