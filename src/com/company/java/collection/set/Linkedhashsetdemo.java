package com.company.java.collection.set;

import java.util.LinkedHashSet;

public class Linkedhashsetdemo {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored

        System.out.println(set);
    }
}
