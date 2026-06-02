package com.company.java.exceptionhandling.nestedtrycatch;

public class NestedTryCatchDemo {

    public static void main(String[] args) {

        try {

            System.out.println("Outer Try Started");

            try {

                int result = 10 / 0;

                System.out.println(result);

            } catch (ArithmeticException e) {

                System.out.println("Inner Catch: Cannot divide by zero");
            }

            System.out.println("Outer Try Continues");

        } catch (Exception e) {

            System.out.println("Outer Catch");
        }

        System.out.println("Program Ended");
    }
}
