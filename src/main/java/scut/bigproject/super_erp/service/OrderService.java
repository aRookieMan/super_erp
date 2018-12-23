package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;
import scut.bigproject.super_erp.entity.returnentity.Result;

import java.util.List;

public interface OrderService {
    /**
     *对应模块1，订单管理模块
     */
    Result insertOrder(Order order, List<OrderDetail> orderDetails);

    Result findOrderById(int id);
}
