package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.OrderDetail;
import java.util.List;

@Mapper
@Component(value = "orderDetailMapper")
public interface OrderDetailMapper {
    @Insert("insert into tb_order_detail(" +
            "product_type," +
            "amount," +
            "order_id," +
            "end_date" +
            ") value(" +
            "#{productType}," +
            "#{amount}," +
            "#{orderId}," +
            "#{endDate}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertOrder(OrderDetail orderDetail);

    @Select("select * from tb_order_detail where id=#{id}")
    OrderDetail findOrderDetailById(int id);

    @Select("select * from tb_order_detail")
    List<OrderDetail> findAllOrderDetail( );

    @Select("select * from tb_order_detail where order_id=#{orderId}")
    List<OrderDetail> findOrderDetailListByOrderId(@Param("orderId") int orderId);

}
