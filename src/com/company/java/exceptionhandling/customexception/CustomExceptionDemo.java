package com.company.java.exceptionhandling.customexception;

public class CustomExceptionDemo {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age must be 18 or above");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try{
            validateAge(15);
        } catch (InvalidAgeException e) {
             System.out.println(e.getMessage());
        }
    }

}
