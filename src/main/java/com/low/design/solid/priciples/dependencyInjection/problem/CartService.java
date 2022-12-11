package com.low.design.solid.priciples.dependencyInjection.problem;

import com.low.design.solid.priciples.interfaceSegregation.solution.ICartService;
import com.low.design.solid.priciples.srp.problems.Item;

public class CartService implements ICartService{

// //   private final CartRepository cartRepo;
//
//    public CartService(CartRepository cartRepo){
//        this.cartRepo = cartRepo;
//    }

    @Override
    public String addItemToCart(Item item){

//        //Implementation Logic
//       ...
//        this.cartRepo.save(Some object params);
//       ...
        return "Some Response String";
    };

    @Override
    public String DeleteItemFromCart(Item item){
        //Implementation Logic
//       ...
//        this.cartRepo.delete(Some object params);
//       ...
        return "Some Response String";
    };

    @Override
    public String UpdateItemInCart(Item item){
        //Implementation Logic
//       ...
//        this.cartRepo.updateIteminCart(Some object params);
//       ...
        return "Some Response String";
    };}
