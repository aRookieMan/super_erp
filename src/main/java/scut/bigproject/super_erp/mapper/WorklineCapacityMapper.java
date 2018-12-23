package scut.bigproject.super_erp.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import scut.bigproject.super_erp.entity.WorklineCapacity;

import java.util.List;

@Mapper
@Component(value = "worklineCapacityMapper")
public interface WorklineCapacityMapper {
    @Select("select * from tb_workline_capacity")
    List<WorklineCapacity> findAllWorklineCapacity();
}
