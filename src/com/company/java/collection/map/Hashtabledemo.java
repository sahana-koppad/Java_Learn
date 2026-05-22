package com.company.java.collection.map;

    import java.util.Hashtable;

    public class Hashtabledemo {
        public static void main(String[] args) {

            Hashtable<Integer, String> map = new Hashtable<>();

            map.put(101, "Sahana");
            map.put(102, "Rahul");
            map.put(103, "Anjali");
           // map.put(null,null);// no null keys and no null values

            map.put(102,"Sahana");//duplicate keys are not allowed but values are allowed

            System.out.println(map);

            //HASHTABLE:Internally Hashtable uses:
            //Array of Buckets
            // Each bucket stores
            //Linked List of Entries

        }
    }
