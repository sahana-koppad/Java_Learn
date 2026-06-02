package com.company.java.exceptionhandling.throwthrows;

public class ThrowThrowsDemo {

    // throws -> declaring exception
    public static void validateAge(int age) throws Exception {

        if (age < 18) {

            // throw -> actually creating and throwing exception
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible for Voting");
    }

    public static void main(String[] args) {

        try {

            validateAge(15);

        } catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}