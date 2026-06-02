package com.company.java.exceptionhandling.basics;

public class ExceptionVsError {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Exception Handled");

        }

        System.out.println("Program Continues");
    }
}

/*Feature               | Exception           | Error             |
        | --------------------- | ------------------- | ----------------- |
        | Recoverable           | Yes                 | No                |
        | Handled by Programmer | Yes                 | Usually No        |
        | Occurs Due To         | Application Issues  | JVM/System Issues |
        | Package               | java.lang.Exception | java.lang.Error   |
        | Example               | IOException         | OutOfMemoryError  |
*/