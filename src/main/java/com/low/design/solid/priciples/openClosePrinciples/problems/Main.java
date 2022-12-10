package com.low.design.solid.priciples.openClosePrinciples.problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pay Credit Card bill");
        System.out.println("Choose your option:");
        System.out.println("1)Pay using Debit Card");
        System.out.println("2)Pay using Net Banking");
        System.out.println("3)Pay using UPI");
        System.out.println("4)Pay using Paytm Wallet");

        Integer option = scanner.nextInt();
        switch (option) {
            case 1:
                creditCard.payWithDebitCard();
                break;
            case 2:
                 creditCard.payWithNetBanking();
                 break;
            case 3:
                 creditCard.payWithUPI();
                 break;
            case 4:
                 creditCard.payWithPaytm();
                 break;
        }
    }
}
