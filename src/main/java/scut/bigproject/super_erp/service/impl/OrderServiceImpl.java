package scut.bigproject.super_erp.service.impl;

import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.OrderMapper;
import scut.bigproject.super_erp.service.OrderService;
import scut.bigproject.super_erp.util.ResultUtil;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    /**
     * 使用算法判断订单是否可以安排，如果可以就返回true，不可以就返回false
     * 无论返回哪个值都需要新建一条数据
     * 如果是true才继续出新建tb_order_detail数据
     * @param order
     * @return
     */
    @Override
    public Result insertOrder(Order order, OrderDetail orderDetail) {
        return ResultUtil.goodResultReturner();
    }

    @Override
    public Result findOrder(int id){
        Order order = orderMapper.findOrder(id);
        order.setOrderDetails(orderMapper.getOrderDetails(id));
        return ResultUtil.goodResultReturner(order);
    }
}
