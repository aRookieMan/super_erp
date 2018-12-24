package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scut.bigproject.super_erp.entity.MaterialInventoryRecord;
import scut.bigproject.super_erp.entity.ProductInventoryRecord;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.service.InventoryService;
import scut.bigproject.super_erp.util.EntityUtil;

import java.util.Map;

@Controller
@RequestMapping(value = "/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    /***
     * 新增库存原料出入记录
     * @param map
     * @return
     */
    @RequestMapping(value = "/insertMaterialRecord", method = RequestMethod.POST)
    @ResponseBody
    public Result insertMaterialInventoryRecord(@RequestBody Map<String, Object> map){
        MaterialInventoryRecord materialInventoryRecord = EntityUtil.object2Entity(
                map.get("materialInventoryRecord"), MaterialInventoryRecord.class);
        return inventoryService.insertMaterialInventoryRecord(materialInventoryRecord);
    }

    /***
     * 根据日期查询库存原料出入记录
     * @param date
     * @return
     */
    @RequestMapping(value = "/findMaterialRecordByDate", method = RequestMethod.GET)
    @ResponseBody
    public Object findMaterialInventoryRecordByDate(@RequestParam(value = "date", required = true) String date){
        return inventoryService.findMaterialInventoryRecordByDate(date);
    }

    /***
     * 新增库存产品出入记录
     * @param map
     * @return
     */
    @RequestMapping(value = "/insertProductRecord", method = RequestMethod.POST)
    @ResponseBody
    public Result insertProductInventoryRecord(@RequestBody Map<String, Object> map){
        ProductInventoryRecord productInventoryRecord = EntityUtil.object2Entity(
                map.get("productInventoryRecord"), ProductInventoryRecord.class);
        return inventoryService.insertProductInventoryRecord(productInventoryRecord);
    }

    /***
     * 根据日期查询库存产品出入记录
     * @param date
     * @return
     */
    @RequestMapping(value = "/findProductRecordByDate", method = RequestMethod.GET)
    @ResponseBody
    public Object findProductInventoryRecordByDate(@RequestParam(value = "date", required = true) String date){
        return inventoryService.findProductInventoryRecordByDate(date);
    }
}
