package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;
import scut.bigproject.super_erp.service.OrderService;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    /***
     * 插入订单，
     * @param order
     * @return
     */
    @RequestMapping(value = "/insertOrder",method = RequestMethod.POST)
    @ResponseBody
    public Object insertOrder(@RequestBody Order order,
                              @RequestBody OrderDetail orderDetail){
        return orderService.insertOrder(order, orderDetail);
    }


    /***
     * 只是一个普通的get请求
     * @param id
     * @return
     */
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    @ResponseBody
    public Object tutorial(@RequestParam(value = "id", required = true) int id){
        return orderService.findOrder(id);
    }
}
