package com.eric.ecommerce.ecommercebackend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.eric.ecommerce.ecommercebackend.model.LocalUser;
import com.eric.ecommerce.ecommercebackend.model.VerificationToken;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object for the VerificationToken data.
 */
public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {

  Optional<VerificationToken> findByToken(String token);

  void deleteByUser(LocalUser user);

  List<VerificationToken> findByUser_IdOrderByIdDesc(Long id);

}
