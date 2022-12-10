package com.low.design.solid.priciples.openClosePrinciples.problems;

public class CreditCard {

    /**
     * Credit card method will be updated if any other payment method will get added
     *
     *
     *
     */


    public void payWithDebitCard() {
        DebitCardHandler debitCardHandler = new DebitCardHandler();
        debitCardHandler.pay();
    }

    public void payWithUPI() {
        UPIHandler upiHandler = new UPIHandler();
        upiHandler.pay();
    }

    public void payWithPaytm() {
        PaytmHandler paytmHandler = new PaytmHandler();
        paytmHandler.pay();
    }

    public void payWithNetBanking() {
        NetBankingHandler netBankingHandler = new NetBankingHandler();
        netBankingHandler.pay();
    }

}
