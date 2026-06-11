package com.company.java.Multithreading.Methods;

public class names extends Thread{
    public void run(){
        System.out.println("thread task");
        System.out.println(Thread.currentThread().getName());
    }//executed by Thread 0

    public static void main(String[] args) {
        /*System.out.println("hello");
        System.out.println(Thread.currentThread().getName()); //main thread
        Thread.currentThread().setName("sahana");//setname to main
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0); //ArithmeticException*/
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());

        names n=new names();
        n.setName("Task2");//thread name will be given by jvm  Thread 0
        n.start();//thread name will be given by jvm
        System.out.println(n.isAlive()); //return true or false
    }
}
