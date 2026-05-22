package com.company.java.collection.list;
import java.util.Vector;
public class vector {
        public static void main(String[] args) {

            // Creating Vector
            Vector<Integer> vector = new Vector<>();

            // Adding elements
            vector.add(10);
            vector.add(20);
            vector.add(30);

            System.out.println("Vector Elements:");
            System.out.println(vector);

            // Accessing element
            System.out.println("Element at index 1: " + vector.get(1));

            // Updating element
            vector.set(1, 200);

            System.out.println("After set():");
            System.out.println(vector);

            // Inserting at specific index
            vector.add(1, 100);

            System.out.println("After add(index, element):");
            System.out.println(vector);

            // Removing element
            vector.remove(2);

            System.out.println("After remove():");
            System.out.println(vector);

            // Size
            System.out.println("Size: " + vector.size());

            // Capacity
            System.out.println("Capacity: " + vector.capacity());

            // Checking element
            System.out.println("Contains 30? " + vector.contains(30));

            // First and Last element
            System.out.println("First Element: " + vector.firstElement());
            System.out.println("Last Element: " + vector.lastElement());

            // Clearing vector
            vector.clear();

            System.out.println("After clear():");
            System.out.println(vector);
        }
    }
