package com.low.design.patterns.command.activity2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StockTrade abcStock = new StockTrade();

        BuyStockCommand buyStockCommand = new BuyStockCommand(abcStock, "Reliance", 100);
        SellStockCommand sellStockCommand = new SellStockCommand(abcStock, "Reliance", 200);

        List<Order> commands = new ArrayList<>();
        commands.add(buyStockCommand);
        commands.add(sellStockCommand);

        Agent agent = new Agent(commands);
        agent.placeOrder(buyStockCommand);
        agent.placeOrder(sellStockCommand);

        agent.processOrders();

    }

}
