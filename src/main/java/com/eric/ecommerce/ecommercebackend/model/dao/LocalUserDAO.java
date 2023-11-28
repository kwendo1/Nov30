package com.eric.ecommerce.ecommercebackend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.eric.ecommerce.ecommercebackend.model.LocalUser;

import java.util.Optional;

/**
 * Data Access Object for the LocalUser data.
 */
public interface LocalUserDAO extends ListCrudRepository<LocalUser, Long> {

  Optional<LocalUser> findByUsernameIgnoreCase(String username);

  Optional<LocalUser> findByEmailIgnoreCase(String email);

}
