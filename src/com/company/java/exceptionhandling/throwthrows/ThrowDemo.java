package com.company.java.exceptionhandling.throwthrows;

public class ThrowDemo {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new ArithmeticException("not eligible to vote");
        }
        System.out.println("ELigible");
    }
}
