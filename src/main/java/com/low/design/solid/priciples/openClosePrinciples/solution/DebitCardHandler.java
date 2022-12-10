package com.low.design.solid.priciples.openClosePrinciples.solution;

public class DebitCardHandler implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay by Debit card..............");
    }
}
