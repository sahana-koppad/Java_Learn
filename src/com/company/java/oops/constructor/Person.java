package com.company.java.oops.constructor;

public class Person {
    int id;
    String name;

    // default constructor
    Person() {
        System.out.println("Default Constructor");
    }

    // parameterized constructor
    Person(int id, String name) {

        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person(101, "Ravi");

        p2.display();
    }
}
