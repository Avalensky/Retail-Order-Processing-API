package com.retail.orderprocessingapi.service;

import com.retail.orderprocessingapi.model.Order;
import com.retail.orderprocessingapi.repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order addOrder(Order order) {

        if (order.getQuantity() <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than 0");
        }

        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}