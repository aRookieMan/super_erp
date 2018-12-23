package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;

public interface OrderService {
    boolean insertOrder(Order order, OrderDetail orderDetail);
    Order findOrder(int id);
}
