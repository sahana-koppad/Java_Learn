package com.company.java.Multithreading.Methods;

public class joinex extends Thread{
    static Thread mainThread;
    public void run(){

try{
    mainThread.join();
    for (int i=1;i<=5;i++){
        System.out.println("child thread"+ i);
        Thread.sleep(1000);
    }
}
catch(Exception e){
    System.out.println(e);
}
    }

    public static void main(String[] args) throws InterruptedException{
        mainThread=Thread.currentThread();
        joinex j=new joinex();
        j.start();

        //j.join();
        try{
            for (int i=1;i<=5;i++){
                System.out.println("main thread"+ i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
