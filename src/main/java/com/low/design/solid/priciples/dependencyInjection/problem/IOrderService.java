package com.low.design.solid.priciples.dependencyInjection.problem;

import org.springframework.core.annotation.Order;

public interface IOrderService {
    String createOrder(Order order);
    String trackOrderStatus(String orderId);
    String makePayment(String orderId);
}
