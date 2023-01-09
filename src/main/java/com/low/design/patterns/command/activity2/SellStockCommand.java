package com.low.design.patterns.command.activity2;

public class SellStockCommand implements Order{

    private final StockTrade abcStock;
    private final String stockName;
    private final int numShares;

    public SellStockCommand(StockTrade abcStock, String stockName, int numShares) {
        this.abcStock = abcStock;
        this.stockName = stockName;
        this.numShares = numShares;
    }

    @Override
    public void execute() {
         this.abcStock.sell(stockName, numShares);
    }
}
