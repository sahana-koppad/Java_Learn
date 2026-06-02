package com.company.java.exceptionhandling.basics.Throwable;

public class getmessage {
    public static void main(String args[]){
        try{
            int x=10/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
