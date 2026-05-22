package com.company.java.collection.list.ArrayList.insertion;

import java.util.ArrayList;

public class AddUsingIndex {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");

        list.add(1, "Spring");

        System.out.println(list);
    }
}
