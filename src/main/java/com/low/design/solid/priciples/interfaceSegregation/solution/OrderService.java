package com.low.design.solid.priciples.interfaceSegregation.solution;

import org.springframework.core.annotation.Order;

public class OrderService implements IOrderService{

    @Override
    public String createOrder(Order order) {
        return null;
    }

    @Override
    public String trackOrderStatus(String orderId) {
        return null;
    }

    @Override
    public String makePayment(String orderId) {
        return null;
    }
}
