package com.company.java.Multithreading;

public class Test extends Thread{
    public void run(){
        System.out.println("running....");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.start();
    }
}
//.....Points......
//extends thread class
//override run method (thread task inside run method)
//create object of class
//start the thread
