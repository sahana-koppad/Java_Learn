package com.company.java.Multithreading.Methods.Daemon;

class Test extends Thread{
    public void run(){
        System.out.println("Child thread");
    }
    public static void main(String args[]){

        System.out.println("Main Thread");

        Test t=new Test();
        t.setDaemon(true);
        t.start();
    }
}
/*
Removing System.out.println("Main Thread")
makes the main thread finish even faster.
Since the child thread is a daemon thread,
the JVM terminates as soon as the main thread
ends. The daemon thread may not get a chance to
execute, resulting in no output. This happens because
thread scheduling is controlled by the JVM and OS,
and start().does not guarantee immediate execution.*/
