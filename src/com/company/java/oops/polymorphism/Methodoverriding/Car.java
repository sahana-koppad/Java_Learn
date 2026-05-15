package com.company.java.oops.polymorphism.Methodoverriding;

public class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}
