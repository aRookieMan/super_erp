package scut.bigproject.super_erp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.ProductInformation;

import java.util.List;

@Mapper
@Component(value = "productInformationMapper")
public interface ProductInformationMapper {
    @Select("select * from tb_product_information")
    List<ProductInformation> findAllProductInformation();
}
