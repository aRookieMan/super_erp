package scut.bigproject.super_erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.OrderDetailMapper;
import scut.bigproject.super_erp.mapper.OrderMapper;
import scut.bigproject.super_erp.service.OrderService;
import scut.bigproject.super_erp.service.ProductAlgorithmService;
import scut.bigproject.super_erp.util.ResultUtil;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Autowired
    private ProductAlgorithmService productAlgorithmService;

    /**
     * 使用算法判断订单是否可以安排，如果可以就返回true，不可以就返回false
     * 无论返回哪个值都需要新建一条数据
     * 如果是true才继续出新建tb_order_detail数据
     * @param order
     * @return
     */
    @Override
    public Result insertOrder(Order order, List<OrderDetail> orderDetails) {
        boolean valid = productAlgorithmService.orderValid(order);
        if (valid){
            orderMapper.insertOrder(order);
            for (OrderDetail orderDetail : orderDetails) {
                orderDetail.setOrderId(order.getId());
                orderDetailMapper.insertOrder(orderDetail);
            }
            return ResultUtil.goodResultReturner();
        }else {
            return ResultUtil.badResultReturner("order no avaliable");
        }
    }

    @Override
    public Result findOrderById(int id){
        Order order = orderMapper.findOrderById(id);
        return ResultUtil.goodResultReturner(order);
    }
}
