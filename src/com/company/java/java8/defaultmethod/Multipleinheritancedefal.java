package com.company.java.java8.defaultmethod;

interface Left{
    default void m1(){
        System.out.println("Left Interface m1 method");
    }
}
interface Right{
    default void m1(){
        System.out.println("Right Interface M1 method");
    }
}
public class Multipleinheritancedefal implements Left,Right {
    @Override
    public void m1(){
        System.out.println("our own m method");
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        Multipleinheritancedefal m=new Multipleinheritancedefal();
        m.m1();
    }
}
