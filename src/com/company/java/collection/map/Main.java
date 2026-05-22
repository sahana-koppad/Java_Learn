package com.company.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map map=new HashMap<>();

        map.put(101,"sahana");
        map.put(102,"ram");
        map.put(103 ,"sakshi");
        map.put(null,null);
        map.put(104,null);
        //map.clear();

        System.out.println(map.containsKey(105));
        System.out.println(map.containsValue("sahana"));
        System.out.println(map.get(102));
        System.out.println(map.hashCode());
        System.out.println(map.replace(102,"ravi"));
        System.out.println(map.size());
        System.out.println(map);
    }
}
