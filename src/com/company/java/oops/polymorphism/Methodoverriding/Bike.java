package com.company.java.oops.polymorphism.Methodoverriding;

public class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with button");
    }
}
