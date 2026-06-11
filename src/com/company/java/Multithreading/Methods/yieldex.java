package com.company.java.Multithreading.Methods;

public class yieldex extends Thread{
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
    public static void main(String[] args) {
        yieldex x=new yieldex();
        x.start();
      //  Thread.yield(); if you want main method to stop and provide chance to other threads for execution

        for (int i=1;i<=5;i++){
            System.out.println("main Thread" + i);
        }
    }
}
