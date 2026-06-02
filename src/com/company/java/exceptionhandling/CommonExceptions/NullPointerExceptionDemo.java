package com.company.java.exceptionhandling.CommonExceptions;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Object Accessed");
            System.out.println(e);
        }
    }
}
