package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.ProductionPlan;

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


}
