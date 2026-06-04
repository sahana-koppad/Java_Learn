package com.company.java.java8.staticmethods;

interface interf{
    public static void m1(){
        System.out.println("Interface static method");
    }
}
public class Staticmethodex {
    public static void main(String[] args) {
       interf.m1(); //interface static methods can call by interface name only
        //m1();
        //Staticmethodex.m1();
        /*Staticmethodex t=new Staticmethodex();
        t.m1();*/

    }
}
