package com.company.java.exceptionhandling.throwthrows;

public class ThrowDemowithcatch {
    public static void main(String[] args) {
        try{
                throw new ArithmeticException("custom message");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
