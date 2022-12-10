package com.low.design.solid.priciples.srp.solution;

import com.low.design.solid.priciples.srp.problems.Address;
import com.low.design.solid.priciples.srp.problems.Item;
import java.util.List;

// Only Order Service Repository has been implemented
public class OrderService implements ICommerce {
    @Override
    public String addItemToCart(Item item) {
        return null;
    }

    @Override
    public String DeleteItemFromCart(Item item) {
        return null;
    }

    @Override
    public String UpdateItemInCart(Item item) {
        return null;
    }

    @Override
    public String createOrder(String username, List<Item> items, Address ShippingAddress) {

        // OrderServiceRepository implements
        // OrderServiceRepository orderServiceRepository = new OrderServiceRepository();
        // orderServiceRepository.save();

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

    @Override
    public String createUserAcount(String name, String address, String age, String phonenum) {
        return null;
    }
}
