package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.MaterialRecord;
import scut.bigproject.super_erp.entity.ProductionRecord;
import scut.bigproject.super_erp.entity.WorklineRecord;

import java.util.ArrayList;

@Mapper
@Component(value = "productRecordMapper")
public interface ProductRecordMapper {
    @Insert("insert into tb_production_record(" +
            "record_date" +
            ") value(" +
            "#{record_date}" +
            ")")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertProductionRecord(ProductionRecord productionRecord);

    @Select("select * from tb_production_record where id=#{id}")
    ProductionRecord findProductionRecord(int id);

    @Select("select * from tb_workline_record where " +
            "production_record_id = #{productionRecordId}")
    ArrayList<WorklineRecord> getWorklineRecords(int productionRecordId);

    @Select("select * from tb_material_record where " +
            "workline_record_id = #{worklineRecordId}")
    ArrayList<MaterialRecord> getMaterialRecords(int worklineRecordId);
}
