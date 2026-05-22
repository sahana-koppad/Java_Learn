package com.company.java.collection.Interface;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String args[]){
        Collection<String> fruits=new ArrayList<>();
        //arraylist implements List
        //list extends collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);


        fruits.remove("Banana");

        System.out.println(fruits);

        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        System.out.println("Size: " + fruits.size());

    }
}