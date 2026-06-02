package com.company.java.exceptionhandling.finallyblock;

public class FinallyDemo {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Exception Handled");

        } finally {

            System.out.println("Finally Executed");
        }
    }
}