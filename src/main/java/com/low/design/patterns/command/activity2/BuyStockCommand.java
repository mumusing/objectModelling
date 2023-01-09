package com.low.design.patterns.command.activity2;

public class BuyStockCommand implements Order {

    private final StockTrade stockTrade;
    private final String stockName;
    private final int numShares;

    public BuyStockCommand(StockTrade abcStock, String stockName, int numShares) {

        this.stockTrade = abcStock;
        this.stockName = stockName;
        this.numShares = numShares;
    }

    @Override
    public void execute() {
        stockTrade.buy(this.stockName, this.numShares);
    }

}
