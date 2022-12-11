package com.low.design.solid.priciples.interfaceSegregation.problems;

import com.low.design.solid.priciples.srp.problems.Address;
import com.low.design.solid.priciples.srp.problems.Item;

import java.util.List;

public class CartService implements IECommerce{
    @Override
    public String addItemToCart(Item item) {
//        CartRepository cartRepo = new CartRepository();
//        //Implementation Logic
//       ...
//        cartRepo.save(Some object params);
//       ...
        return "Some Response String";
    }

    @Override
    public String DeleteItemFromCart(Item item) {

//        CartRepository cartRepo = new CartRepository();
//        //Implementation Logic
//       ...
//        cartRepo.save(Some object params);
//       ...
        return "Some Response String";
    }

    @Override
    public String UpdateItemInCart(Item item) {
//        CartRepository cartRepo = new CartRepository();
//        //Implementation Logic
//       ...
//        cartRepo.save(Some object params);
//       ...
        return "Some Response String";
    }

    @Override
    public String createOrder(String username, List<Item> items, Address ShippingAddress) {
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
