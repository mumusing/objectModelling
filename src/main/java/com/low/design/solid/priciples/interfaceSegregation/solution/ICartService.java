package com.low.design.solid.priciples.interfaceSegregation.solution;

import com.low.design.solid.priciples.srp.problems.Item;

public interface ICartService {
    String addItemToCart(Item item);
    String DeleteItemFromCart(Item item);
    String UpdateItemInCart(Item item);
}
