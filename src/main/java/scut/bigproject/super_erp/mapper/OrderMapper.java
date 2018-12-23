package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.Order;

@Mapper
@Component(value = "orderMapper")
public interface OrderMapper {
    @Insert("insert into tb_order(" +
            "customer_name," +
            "customer_phone," +
            "start_date," +
            "valid_code" +
            ") value(" +
            "#{customerName}," +
            "#{customerPhone}," +
            "#{startDate}," +
            "#{validCode}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertOrder(Order order);

    @Select("select * from tb_order where id=#{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "customer_name",property = "customerName"),
            @Result(column = "customer_phone",property = "customerPhone"),
            @Result(column = "start_date",property = "startDate"),
            @Result(column = "valid_code",property = "validCode"),

            @Result(property = "orderDetails",column = "id",many =
            @Many(select = "scut.bigproject.super_erp.mapper.OrderDetailMapper.findOrderDetailListByOrderId"))
    })
    Order findOrderById(@Param("id") int id);
}
