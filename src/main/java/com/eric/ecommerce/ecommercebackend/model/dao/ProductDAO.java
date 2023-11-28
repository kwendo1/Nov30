package com.eric.ecommerce.ecommercebackend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.eric.ecommerce.ecommercebackend.model.Product;

/**
 * Data Access Object for accessing Product data.
 */
public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
