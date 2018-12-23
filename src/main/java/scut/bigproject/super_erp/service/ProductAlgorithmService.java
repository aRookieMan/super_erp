package scut.bigproject.super_erp.service;

import scut.bigproject.super_erp.entity.Order;

public interface ProductAlgorithmService {
    /**
     * 对应模块2，生产算法管理模块
     */

    boolean orderValid (Order order);
}
