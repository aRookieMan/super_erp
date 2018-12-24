package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.WorklineRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.service.ProductRecordService;
import scut.bigproject.super_erp.util.EntityUtil;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/record")
public class ProductRecordController {
    @Autowired
    ProductRecordService productRecordService;

    @RequestMapping(value = "/insertRecord", method = RequestMethod.POST)
    @ResponseBody
    public Result insertProductRecord(@RequestBody Map<String, Object> map){
        ProductionRecord productionRecord = EntityUtil.object2Entity(
                map.get("productionRecord"), ProductionRecord.class);
        List<WorklineRecord> worklineRecords = EntityUtil.objectList2EntityList(
                map.get("worklineRecords"), WorklineRecord.class);
        return productRecordService.insertProductionRecord(productionRecord, worklineRecords);
    }

    /***
     * 根据Id查询生产记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/findRecordById", method = RequestMethod.GET)
    @ResponseBody
    public Object tutorial(@RequestParam(value = "id", required = true) int id){
        return productRecordService.findProductionRecordById(id);
    }

    /***
     * 根据日期查询生产记录
     * @param date
     * @return
     */
    @RequestMapping(value = "/findRecordByDate", method = RequestMethod.GET)
    @ResponseBody
    public Object tutorial(@RequestParam(value = "date", required = true) String date){
        return productRecordService.findProductionRecordByDate(date);
    }
}
