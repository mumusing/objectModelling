package com.low.design.solid.priciples.openClosePrinciples.solution;

public class NetBankingHandler implements Payment {

    @Override
    public void pay() {
        System.out.println("Pay By Net Banking...............");
    }
}
