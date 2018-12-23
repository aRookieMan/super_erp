package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.WorklinePlan;

import java.util.List;

@Mapper
@Component(value = "worklinePlanMapper")
public interface WorklinePlanMapper {
    @Insert("insert into tb_workline_plan(" +
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

    @Select("select * from tb_workline_plan where production_plan_id=#{productionPlanId}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "workline_id",property = "worklineId"),
            @Result(column = "product_type",property = "productType"),
            @Result(column = "product_amount",property = "productAmount"),
            @Result(column = "production_plan_id",property = "productionPlanId"),

            @Result(property = "materialPlans",column = "id",many =
            @Many(select = "scut.bigproject.super_erp.mapper.MaterialPlanMapper.findWorklinePlanIdByWorklinePlanId"))
    })
    List<WorklinePlan> findWorklinePlanByProductionPlanId(@Param("productionPlanId") int productionPlanId);
}
