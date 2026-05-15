package com.company.java.oops.encapsulation;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Rahul");
        emp.setSalary(50000);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}