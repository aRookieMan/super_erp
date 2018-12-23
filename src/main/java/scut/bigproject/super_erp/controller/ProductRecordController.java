package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scut.bigproject.super_erp.service.ProductRecordService;

@Controller
@RequestMapping(value = "/productRecord")
public class ProductRecordController {
    @Autowired
    ProductRecordService productRecordService;

    /***
     * 查询生产记录
     * @param id
     * @return
     */
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public Object tutorial(@RequestParam(value = "id", required = true) int id){
        return productRecordService.findProductionRecord(id);
    }
}
