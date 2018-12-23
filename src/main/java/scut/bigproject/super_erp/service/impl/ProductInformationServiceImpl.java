package scut.bigproject.super_erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.returnentity.Result;
import scut.bigproject.super_erp.mapper.MaterialInformationMapper;
import scut.bigproject.super_erp.mapper.ProductInformationMapper;
import scut.bigproject.super_erp.mapper.WorklineCapacityMapper;
import scut.bigproject.super_erp.service.ProductInformationService;
import scut.bigproject.super_erp.util.ResultUtil;

@Service
public class ProductInformationServiceImpl implements ProductInformationService {
    @Autowired
    WorklineCapacityMapper worklineCapacityMapper;
    @Autowired
    ProductInformationMapper productInformationMapper;
    @Autowired
    MaterialInformationMapper materialInformationMapper;

    @Override
    public Result getMaterialInformation() {
        return ResultUtil.goodResultReturner(materialInformationMapper.findAllMaterialInformation());
    }

    @Override
    public Result getProductInformation() {
        return ResultUtil.goodResultReturner(productInformationMapper.findAllProductInformation());
    }

    @Override
    public Result getWorklineCapacity() {
        return ResultUtil.goodResultReturner(worklineCapacityMapper.findAllWorklineCapacity());
    }
}
