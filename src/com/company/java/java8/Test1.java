package com.company.java.java8;

import java.util.*;
import java.util.stream.Collectors;

/*class MyComparator implements Comparator<Integer>{
    public int compare(Integer I1 ,Integer I2)
    {
        return (I1<I2)?-1:(I1>I2)?1:0;
    }
}*/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(30);
        l.add(36);
        l.add(80);
        l.add(45);
        l.add(23);
        System.out.println(l);
        Comparator<Integer> c =(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;// lamda expressions
        Collections.sort(l,c);
        //System.out.println(l);
        l.stream().forEach(System.out::println);
        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
