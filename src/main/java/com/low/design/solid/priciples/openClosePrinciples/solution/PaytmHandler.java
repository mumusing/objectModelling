package com.low.design.solid.priciples.openClosePrinciples.solution;

public class PaytmHandler implements Payment {

    @Override
    public void pay() {
      System.out.println("Pay By Paytm..............");
    }
}
