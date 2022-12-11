package com.low.design.solid.priciples.dependencyInjection.problem;

import com.low.design.solid.priciples.interfaceSegregation.solution.IOrderService;
import org.springframework.core.annotation.Order;

public class OrderService implements IOrderService{

    @Override
    public String createOrder(Order order) {
//        OrderRepository orderRepo = new OrderRepository();
//        //Implementation Logic
//       ...
//        orderRepo.save(Some object params);
//       ...
        return "Some Response String";
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
