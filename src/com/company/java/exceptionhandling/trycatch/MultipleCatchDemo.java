package com.company.java.exceptionhandling.trycatch;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            String str = null;

            System.out.println(str.length());

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Error");

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Error");

        } catch (Exception e) {

            System.out.println("Generic Exception");

        }
    }
}
