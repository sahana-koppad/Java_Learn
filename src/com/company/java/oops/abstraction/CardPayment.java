package com.company.java.oops.abstraction;

public class CardPayment extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("Card Payment: " + amount);
    }
}
