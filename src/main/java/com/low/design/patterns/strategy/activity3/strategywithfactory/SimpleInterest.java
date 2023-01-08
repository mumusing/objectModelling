package com.low.design.patterns.strategy.activity3.strategywithfactory;

public class SimpleInterest implements InterestCalculationStrategy {
    @Override
    public double calculateInterest(double principal, double rate, int term) {
        return ((principal * term * rate) / 100);
    }

    @Override
    public String toString() {
        return "Simple Interest";
    }
}
