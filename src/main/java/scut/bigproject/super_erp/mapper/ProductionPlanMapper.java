package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.ProductionPlan;

import java.util.List;

@Mapper
@Component(value = "productionPlanMapper")
public interface ProductionPlanMapper {
    @Insert("insert into tb_production_plan(" +
            "plan_date" +
            ") value(" +
            "#{planDate}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertProductionPlan(ProductionPlan productionPlan);

    @Select("select * from tb_production_plan where plan_date=#{planDate}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "plan_date",property = "planDate"),

            @Result(property = "orderDetails",column = "id",many =
            @Many(select = "scut.bigproject.super_erp.mapper.WorklinePlanMapper.findWorklinePlanByProductionPlanId"))
    })
    List<ProductionPlan> findProductionPlanByDate(@Param("planDate") String planDate);
}
