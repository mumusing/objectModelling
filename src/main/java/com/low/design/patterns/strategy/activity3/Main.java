package com.low.design.patterns.strategy.activity3;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(123345l, "mukesh singh", AccountType.CURRENT);
        account1.setInterestStrategy(new CompoundInterest());
        account1.deposit(10000.0d);

        System.out.println(account1);
        System.out.println(" has interest: "+ account1.getInterest(4));

        Account account2 = new Account(123456l, "Alok Singh", AccountType.SAVING);
        account2.setInterestStrategy(new SimpleInterest());
        account2.deposit(2000.0d);

        System.out.println(account2);
        System.out.println(" has interest " + account2.getInterest(5));


    }

}
