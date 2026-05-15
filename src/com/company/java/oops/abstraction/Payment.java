package com.company.java.oops.abstraction;

abstract public class Payment {
    abstract void pay(double amount);
    void PaymentStarted(){
        System.out.println("payment Started");
    }
}
