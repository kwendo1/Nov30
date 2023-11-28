package com.eric.ecommerce.ecommercebackend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.eric.ecommerce.ecommercebackend.model.LocalUser;
import com.eric.ecommerce.ecommercebackend.model.WebOrder;

import java.util.List;

/**
 * Data Access Object to access WebOrder data.
 */
public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {

  List<WebOrder> findByUser(LocalUser user);

}
