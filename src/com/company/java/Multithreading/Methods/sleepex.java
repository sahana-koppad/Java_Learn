package com.company.java.Multithreading.Methods;

public class sleepex extends Thread{
    public void run() {
        for(int i=1;i<=59;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)  {
        sleepex s=new sleepex();
        s.start();
    }
}
