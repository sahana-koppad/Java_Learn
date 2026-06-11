package com.company.java.String;

public class immutable {
    public static void main(String[] args) {
        String s=new String("deepak");
        String s1=new String("deepak");
        System.out.println(s==s1);
        String s3="ram";
        String s4="ram";
        System.out.println(s3==s4);
    }
}
