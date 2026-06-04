package com.company.java.java8.streams.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);
        num.add(30);

        List<Integer> l=num.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(l);
    }

}
