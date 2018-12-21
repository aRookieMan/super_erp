package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
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
            "#{customer_name}," +
            "#{customer_phone}," +
            "#{start_date}," +
            "#{valid_code}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertOrder(Order order);
}
