package scut.bigproject.super_erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;
import scut.bigproject.super_erp.service.OrderService;
import scut.bigproject.super_erp.util.EntityUtil;

import java.util.Map;


@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    /***
     * 插入订单
     * @param map
     * @return
     */
    @RequestMapping(value = "/insertOrder",method = RequestMethod.POST)
    @ResponseBody
    public Object insertOrder(@RequestBody Map<String,Object> map){
        Order order = EntityUtil.object2Entity(map.get("order"), Order.class);
        OrderDetail orderDetail = EntityUtil.object2Entity(map.get("orderDetail"), OrderDetail.class);
        return orderService.insertOrder(order, orderDetail);
    }


    /***
     * 查询订单
     * @param id
     * @return
     */
    @RequestMapping(value = "/findOrderById",method = RequestMethod.GET)
    @ResponseBody
    public Object findOrderById(@RequestParam(value = "id", required = true) int id){
        return orderService.findOrderById(id);
    }
}
