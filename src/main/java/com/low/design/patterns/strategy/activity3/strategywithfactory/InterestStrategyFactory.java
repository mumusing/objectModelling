package com.low.design.patterns.strategy.activity3.strategywithfactory;

public class InterestStrategyFactory {

    public static InterestCalculationStrategy createStrategy(StrateyType strateyType) {
        InterestCalculationStrategy strategy = null;

        if (strateyType != null) {
            if (StrateyType.COMPOUND.equals(strateyType)) {
                strategy = new CompoundInterest();
            } else if (StrateyType.SIMPLE.equals(strateyType)) {
                strategy = new SimpleInterest();
            } else {
                return null;
            }
        }
     return strategy;
    }


}
