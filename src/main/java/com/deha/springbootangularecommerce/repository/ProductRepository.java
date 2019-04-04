package com.deha.springbootangularecommerce.repository;

import com.deha.springbootangularecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
