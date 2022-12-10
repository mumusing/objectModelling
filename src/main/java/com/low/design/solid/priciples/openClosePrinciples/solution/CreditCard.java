package com.low.design.solid.priciples.openClosePrinciples.solution;

public class CreditCard {

    public void pay(String paymentType) {
        Payment payment = PaymentFactory.getPayment(paymentType);
        payment.pay();
    }

}
