package com.eric.ecommerce.ecommercebackend.service;

import org.springframework.stereotype.Service;

import com.eric.ecommerce.ecommercebackend.model.LocalUser;
import com.eric.ecommerce.ecommercebackend.model.WebOrder;
import com.eric.ecommerce.ecommercebackend.model.dao.WebOrderDAO;

import java.util.List;

/**
 * Service for handling order actions.
 */
@Service
public class OrderService {

  /** The Web Order DAO. */
  private WebOrderDAO webOrderDAO;

  /**
   * Constructor for spring injection.
   * @param webOrderDAO
   */
  public OrderService(WebOrderDAO webOrderDAO) {
    this.webOrderDAO = webOrderDAO;
  }

  /**
   * Gets the list of orders for a given user.
   * @param user The user to search for.
   * @return The list of orders.
   */
  public List<WebOrder> getOrders(LocalUser user) {
    return webOrderDAO.findByUser(user);
  }

}
