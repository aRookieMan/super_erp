package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.WorklinePlan;

@Mapper
@Component(value = "worklinePlanMapper")
public interface WorklinePlanMapper {
    @Insert("insert into tb_order_detail(" +
            "workline_id," +
            "product_type," +
            "product_amount," +
            "production_plan_id" +
            ") value(" +
            "#{worklineId}," +
            "#{productType}," +
            "#{productAmount}," +
            "#{productionPlanId}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertOrder(WorklinePlan worklinePlan);


}
