package com.company.java.Multithreading.cases;

//performing single task from single Thread
public class Test extends Thread{
    public void start(){
        super.start();
        System.out.println("start method");
    }
    public  void run(){
        for (int i=0;i<=3;i++){
            System.out.println("child Thread");
        }

    }

    public static void main(String[] args) {
        Test t=new Test();
        t.start();
        for (int i=0;i<=3;i++){
            System.out.println("main Thread");
        }

    }
}
