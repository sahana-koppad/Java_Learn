package com.company.java.java8.Anonymousinnerclass;

public class Test {
    public static void main(String[] args) {
      /*  Runnable r=new Runnable() {
            //wherever required functionality then we go for Anonymous inner class
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("child Thread");
                }
            }
        };*/
         Runnable r=()->{
             for(int i=0;i<10;i++){
                 System.out.println("child thread");
             }
         };
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("main Thread");
        }
    }
}
