package com.deha.springbootangularecommerce.repository;

import com.deha.springbootangularecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
