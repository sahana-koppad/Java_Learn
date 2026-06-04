package com.company.java.java8.defaultmethod;

interface interf{
    default void m1(){
        System.out.println("Default method");
    }
    /*default int hashcode(){ //not allowed already present in java.lang.object
        return 10; //invalid
    }*/
}
public class exampledef implements interf{
    @Override
    public void m1(){
        System.out.println("overriding version of default method");
    }
    public static void main(String[] args) {
        exampledef e=new exampledef();
        e.m1();
    }
}
