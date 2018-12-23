package scut.bigproject.super_erp.mapper;


import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.ProductionPlan;
import scut.bigproject.super_erp.entity.PurchasePlan;

import java.util.List;

@Mapper
@Component(value = "purchasePlanMapper")
public interface PurchasePlanMapper {
    @Insert("insert into tb_purchase_plan(" +
            "material_id," +
            "material_amount," +
            "cost," +
            "deadline," +
            "valid_code" +
            ") value(" +
            "#{materialId}," +
            "#{materialAmount}," +
            "#{cost}," +
            "#{deadline}," +
            "#{validCode}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertPurchasePlan(PurchasePlan purchasePlan);

    @Select("select * from tb_purchase_plan where valid_code = 0 order by deadline asc")
    List<PurchasePlan> findAllUncompletePurchasePlan();

    @Update("update tb_purchase_plan set valid_code = 1 where id = #{id}")
    int finishPurchasePlan(@Param("id") int id);
}
