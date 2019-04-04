package com.deha.springbootangularecommerce.repository;

import com.deha.springbootangularecommerce.model.OrderProduct;
import com.deha.springbootangularecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
