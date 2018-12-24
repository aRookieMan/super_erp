package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.MaterialInventoryRecord;
import scut.bigproject.super_erp.entity.ProductInventoryRecord;

import java.util.List;

@Mapper
@Component(value = "inventoryMapper")
public interface InventoryMapper {
    @Insert("insert into tb_material_inventory_record(" +
            "material_id," +
            "material_amount," +
            "in_out_code," +
            "record_date," +
            "target" +
            ") value(" +
            "#{materialId}," +
            "#{materialAmount}," +
            "#{inOutCode}," +
            "#{recordDate}," +
            "#{target}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertMaterialInventoryRecord(MaterialInventoryRecord materialInventoryRecord);

    @Insert("insert into tb_product_inventory_record(" +
            "product_type," +
            "product_amount," +
            "in_out_code," +
            "record_date," +
            "target" +
            ") value(" +
            "#{productType}," +
            "#{productAmount}," +
            "#{inOutCode}," +
            "#{recordDate}," +
            "#{target}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertProductInventoryRecord(ProductInventoryRecord productInventoryRecord);


    @Select("select * from tb_product_inventory_record where record_date=#{recordDate}")
    List<ProductInventoryRecord> findProductInventoryRecordByDate(String recordDate);

    @Select("select * from tb_material_inventory_record where record_date=#{recordDate}")
    List<MaterialInventoryRecord> findMaterialInventoryRecordByDate(String recordDate);
}
