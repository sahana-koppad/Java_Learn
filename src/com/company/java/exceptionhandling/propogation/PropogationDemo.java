package com.company.java.exceptionhandling.propogation;

public class PropogationDemo {
    static void m3(){
        int a=10/0;
    }
    static void m2(){
        m3();
    }
    static void m1(){
        m2();
    }

    public static void main(String[] args) {
        try{
            m1();
        } catch (Exception e) {
            System.out.println("handled");
        }
    }
}
