package com.company.java.Multithreading.Methods;

public class Priorityexam extends Thread {
    public void run(){
    System.out.println("child thread");
    System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getPriority());
       Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Priorityexam p=new Priorityexam();
        p.start();
    }
}
