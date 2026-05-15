package com.company.java.oops.abstraction;

public class UpiPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}
