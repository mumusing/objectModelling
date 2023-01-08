package com.low.design.patterns.strategy.activity3.strategywithfactory;

public class CompoundInterest implements InterestCalculationStrategy {
    @Override
    public double calculateInterest(double principal, double rate, int term) {
        return (principal * Math.pow(1.0 + rate/100.0, term) - principal);
    }

    @Override
    public String toString() {
        return "Compound Interest";
    }
}
