package com.company.java.exceptionhandling.finallyblock;

public class FinallyReturn {
    public static int test() {
        try {
            return 10;
        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}


