package com.company.java.collection.list.ArrayList.insertion;

import java.util.ArrayList;

    public class AddAllUsingIndex {

        public static void main(String[] args) {

            ArrayList<String> backend = new ArrayList<>();

            backend.add("Java");
            backend.add("Spring");

            ArrayList<String> frontend = new ArrayList<>();

            frontend.add("HTML");
            frontend.add("CSS");

            backend.addAll(1, frontend);

            System.out.println(backend);
        }
    }

