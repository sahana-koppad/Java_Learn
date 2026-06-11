package com.company.java.Multithreading.cases;

class Task1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}
class Task2 extends Thread{
    public void run(){
        System.out.println("task 2");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        t1.start();
        Task2 t2=new Task2();
        t2.start();

    }
}
