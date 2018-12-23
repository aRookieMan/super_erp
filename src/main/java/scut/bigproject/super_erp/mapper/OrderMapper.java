package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.entity.OrderDetail;
import java.util.ArrayList;

@Mapper
@Component(value = "orderMapper")
public interface OrderMapper {
    @Insert("insert into tb_order(" +
            "customer_name," +
            "customer_phone," +
            "start_date," +
            "valid_code" +
            ") value(" +
            "#{customer_name}," +
            "#{customer_phone}," +
            "#{start_date}," +
            "#{valid_code}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertOrder(Order order);

    @Select("select * from tb_order where id=#{id}")
    Order findOrder(int id);

    @Select("select * from tb_order_detail where order_id = #{orderId}")
    ArrayList<OrderDetail> getOrderDetails(int orderId);
}
