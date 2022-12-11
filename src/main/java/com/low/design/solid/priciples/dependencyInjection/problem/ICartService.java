package com.low.design.solid.priciples.dependencyInjection.problem;

import com.low.design.solid.priciples.srp.problems.Item;

public interface ICartService {
    String addItemToCart(Item item);
    String DeleteItemFromCart(Item item);
    String UpdateItemInCart(Item item);
}
