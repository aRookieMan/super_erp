package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.returnentity.Result;

public interface ProductInformationService {
    /**
     * 对应模块4，生产信息管理模块
     */

    Result getMaterialInformation();

    Result getProductInformation();

    Result getWorklineCapacity();

}
