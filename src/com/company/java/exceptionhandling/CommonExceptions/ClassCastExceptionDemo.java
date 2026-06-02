package com.company.java.exceptionhandling.CommonExceptions;
public class ClassCastExceptionDemo {

    public static void main(String[] args) {

        Object obj = "Java";

        try {
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Invalid Type Casting");
            System.out.println(e);
        }
    }
}