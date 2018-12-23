package scut.bigproject.super_erp.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.MaterialInformation;

import java.util.List;

@Mapper
@Component(value = "materialInformationMapper")
public interface MaterialInformationMapper {
    @Select("select * from tb_material_information")
    List<MaterialInformation> findAllMaterialInformation();
}
