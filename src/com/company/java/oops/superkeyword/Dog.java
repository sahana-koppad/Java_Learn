package com.company.java.oops.superkeyword;

public class Dog extends Animal{
    Dog() {

        super();

        System.out.println("Dog Constructor");
    }

    void sound() {

        super.sound();

        System.out.println("Dog barks");
    }
}
