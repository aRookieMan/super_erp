package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import scut.bigproject.super_erp.service.ProductInformationService;

@Controller
@RequestMapping(value = "/productInformation")
public class ProductInformationController {
    @Autowired
    ProductInformationService productInformationService;

    /***
     * 查看原料信息
     * @return
     */
    @RequestMapping(value = "/getMaterialInformation",method = RequestMethod.GET)
    @ResponseBody
    public Object getMaterialInformation() {
        return productInformationService.getMaterialInformation();
    }

    /***
     * 查看产品信息
     * @return
     */
    @RequestMapping(value = "/getProductInformation",method = RequestMethod.GET)
    @ResponseBody
    public Object getProductInformation() {
        return productInformationService.getProductInformation();
    }

    /***
     * 查看生产线容量
     * @return
     */
    @RequestMapping(value = "/getWorklineCapacity",method = RequestMethod.GET)
    @ResponseBody
    public Object getWorklineCapacity() {
        return productInformationService.getWorklineCapacity();
    }
}
