package com.company.java.exceptionhandling.CommonExceptions;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        String value = "ABC";

        try {
            int num = Integer.parseInt(value);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Format");
            System.out.println(e);
        }
    }
}