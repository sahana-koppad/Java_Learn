package com.company.java.oops.abstraction;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();

        p1.PaymentStarted();
        p1.pay(500);

        p2.PaymentStarted();
        p2.pay(1000);
    }
}
