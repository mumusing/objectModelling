package com.low.design.patterns.command.activity2;

public class StockTrade {

    public void buy(String stockName, int numShares){
        System.out.println("Stock [ Name: "+stockName+", Quantity: " + numShares +" ] bought");
    }
    public void sell(String stockName, int numShares){
        System.out.println("Stock [ Name: "+stockName+", Quantity: " + numShares +" ] sold");
    }

}
