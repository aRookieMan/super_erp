package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.MaterialRecord;
import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.WorklineRecord;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Component(value = "productRecordMapper")
public interface ProductRecordMapper {
    @Insert("insert into tb_production_record(" +
            "record_date" +
            ") value(" +
            "#{recordDate}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertProductionRecord(ProductionRecord productionRecord);

    @Insert("insert into tb_workline_record(" +
            "workline_id," +
            "product_type," +
            "product_amount," +
            "production_record_id" +
            ") value(" +
            "#{worklineId}," +
            "#{productType}," +
            "#{productAmount}," +
            "#{productionRecordId}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertWorklineRecord(WorklineRecord worklineRecord);

    @Insert("insert into tb_material_record(" +
            "material_id," +
            "material_amount," +
            "workline_record_id" +
            ") value(" +
            "#{materialId}," +
            "#{materialAmount}," +
            "#{worklineRecordId}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertMaterialRecord(MaterialRecord materialRecord);
    
    @Select("select * from tb_production_record where id=#{id}")
    ProductionRecord findProductionRecordById(int id);

    @Select("select * from tb_production_record where record_date=#{recordDate}")
    ProductionRecord findProductionRecordByDate(String recordDate);

    @Select("select * from tb_workline_record where " +
            "production_record_id = #{productionRecordId}")
    ArrayList<WorklineRecord> getWorklineRecords(int productionRecordId);

    @Select("select * from tb_material_record where " +
            "workline_record_id = #{worklineRecordId}")
    ArrayList<MaterialRecord> getMaterialRecords(int worklineRecordId);
}
