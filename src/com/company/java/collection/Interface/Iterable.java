package com.company.java.collection.Interface;

import java.util.Arrays;
import java.util.List;

public class Iterable {
    public static void main(String args[]){
        List<String> names= Arrays.asList("Alice","Bob","Charlie");


        // names implements iterable
        for(String name:names){
            System.out.println(name);
        }
    }
}
