//package scut.bigproject.super_erp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import scut.bigproject.super_erp.entity.MaterialRecord;
//import scut.bigproject.super_erp.entity.ProductionRecord;
//import scut.bigproject.super_erp.entity.WorklineRecord;
//import scut.bigproject.super_erp.entity.returnentity.Result;
//import scut.bigproject.super_erp.service.ProductRecordService;
//import scut.bigproject.super_erp.util.EntityUtil;
//
//import java.util.ArrayList;
//import java.util.Map;
//
//@Controller
//@RequestMapping(value = "/productRecord")
//public class ProductRecordController {
//    @Autowired
//    ProductRecordService productRecordService;
//
//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    @ResponseBody
//    public Result insertProductRecord(@RequestBody Map<String, Object> map){
//        ProductionRecord productionRecord = EntityUtil.object2Entity(
//                map.get("productionRecord"), ProductionRecord.class);
//
//
//    }
//    /***
//     * 查询生产记录
//     * @param id
//     * @return
//     */
//
//    @RequestMapping(value = "/findProductRecordById", method = RequestMethod.GET)
//    @ResponseBody
//    public Object tutorial(@RequestParam(value = "id", required = true) int id){
//        return productRecordService.findProductionRecord(id);
//    }
//}
