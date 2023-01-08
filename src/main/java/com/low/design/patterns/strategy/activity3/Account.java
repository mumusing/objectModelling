package com.low.design.patterns.strategy.activity3;

public class Account {

    private long accountNo;
    private String accountHolderName;
    private AccountType accountType;
    private double amount;
    private InterestCalculationStrategy interestStrategy;



    public Account() {
        super();
    }

    public Account(long accountNo, String accountHolderName, AccountType accountType) {
        this();
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public Account(long accountNo, String accountHolderName, AccountType accountType, InterestCalculationStrategy interestStrategy) {

        this(accountNo, accountHolderName, accountType);
        this.interestStrategy = interestStrategy;

    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public InterestCalculationStrategy getInterestStrategy() {
        return interestStrategy;
    }

    public void setInterestStrategy(InterestCalculationStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public void deposit(double amount) {
        if (amount > 0.0d) {
            this.amount += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0.0d && amount < this.amount) {
            this.amount -= amount;
        }
    }

    public double getInterest(int term) {
        if (getInterestStrategy() != null && getAccountType() != null) {
             return  getInterestStrategy().calculateInterest(getAmount(), getAccountType().getRate(), term);
        }
        return 0.0d;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType=" + accountType +
                ", amount=" + amount +
                ", interestStrategy=" + interestStrategy +
                '}';
    }




}
