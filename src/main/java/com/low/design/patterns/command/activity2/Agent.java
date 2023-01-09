package com.low.design.patterns.command.activity2;

import java.util.List;

public class Agent {

    private final List<Order> orders;

    public Agent(List<Order> orders) {
        this.orders = orders;
    }

    public void placeOrder(Order order) {
        order.execute();
    }

    public void processOrders() {
        orders.stream().forEach(order -> {
            order.execute();
        });
    }

}
