package com.company.java.oops.thiskeyword;

public class Student {
    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Aman");
        Student s2 = new Student(2, "Kiran");

        s1.display();
        s2.display();
    }
}
