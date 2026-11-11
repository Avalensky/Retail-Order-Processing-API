package com.retail.orderprocessingapi.repository;

import com.retail.orderprocessingapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository
        extends JpaRepository<Order, Long> {

}