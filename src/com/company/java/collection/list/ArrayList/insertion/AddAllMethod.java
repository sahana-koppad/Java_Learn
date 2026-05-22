package com.company.java.collection.list.ArrayList.insertion;

import java.util.LinkedList;

public class AddAllMethod {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // add() -> inserts at END
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After add():");
        System.out.println(list);

        // push() -> inserts at BEGINNING
        list.push(5);
        list.push(1);

        System.out.println("\nAfter push():");
        System.out.println(list);
    }
}