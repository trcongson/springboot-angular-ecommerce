package com.deha.springbootangularecommerce.service.Impl;

import com.deha.springbootangularecommerce.model.OrderProduct;
import com.deha.springbootangularecommerce.repository.OrderProductRepository;
import com.deha.springbootangularecommerce.service.OrderProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}

