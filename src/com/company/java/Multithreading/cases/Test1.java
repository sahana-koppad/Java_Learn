package com.company.java.Multithreading.cases;

public class Test1 extends Thread{
    public void run(){
        System.out.println("single task with multiple thread");
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.start();
        Test1 t2=new Test1();
        t2.start();
    }
}
