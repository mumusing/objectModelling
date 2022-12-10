package com.low.design.solid.priciples.srp.problems;

import java.util.List;

public interface IECommerce {
    String addItemToCart(Item item);
    String DeleteItemFromCart(Item item);
    String UpdateItemInCart(Item item);
    String createOrder(String username, List<Item> items, Address ShippingAddress );
    String trackOrderStatus(String orderId);
    String makePayment(String orderId);
    String createUserAcount(String name, String address, String age, String phonenum);
}
