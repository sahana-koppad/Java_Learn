package com.company.java.Multithreading;

public class Runnableex implements Runnable{
    public void run(){
        System.out.println("thread task runnable");
    }

    public static void main(String[] args) {
        Runnableex r=new Runnableex();
        Thread th=new Thread(r);
        th.start();
    }
}
