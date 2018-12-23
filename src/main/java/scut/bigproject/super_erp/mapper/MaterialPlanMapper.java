package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.MaterialPlan;

import java.util.List;

@Mapper
@Component(value = "materialPlanMapper")
public interface MaterialPlanMapper {
    @Insert("insert into tb_material_plan(" +
            "material_id," +
            "material_amount," +
            "workline_plan_id" +
            ") value(" +
            "#{materialId}," +
            "#{materialAmount}," +
            "#{worklinePlanId}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertMaterialPlan(MaterialPlan materialPlan);

    @Select("select * from tb_material_plan where workline_plan_id = #{worklinePlanId}")
    List<MaterialPlan> findWorklinePlanIdByWorklinePlanId(@Param("worklinePlanId") int worklinePlanId);
}
