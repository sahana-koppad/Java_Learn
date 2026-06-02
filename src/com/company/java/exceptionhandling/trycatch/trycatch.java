package com.company.java.exceptionhandling.trycatch;

public class trycatch {
    public static void main(String[] args) {
        System.out.println("Program Started");

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program Ended");
    }
}
