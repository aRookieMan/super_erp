package scut.bigproject.super_erp.service.impl;

import org.springframework.stereotype.Service;
import scut.bigproject.super_erp.entity.Order;
import scut.bigproject.super_erp.service.ProductAlgorithmService;

@Service
public class ProductAlgorithmServiceImpl implements ProductAlgorithmService {
    @Override
    public boolean orderValid(Order order) {
        return true;
    }
}
