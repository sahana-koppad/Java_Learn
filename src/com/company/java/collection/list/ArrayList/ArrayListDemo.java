package com.company.java.collection.list.ArrayList;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //declare ArrayList
        ArrayList<Integer> al=new ArrayList<>();
        //ArrayList<Integer> al=new ArrayList<>();
        //ArrayList<String> al=new ArrayList<>();

        //list interface is implemneted by arraylist
        //List al=new ArrayList();

        //add new elemnts to arrayList
        al.add(100);
        al.add(200);
        al.add(150);
        al.add(250);
        al.add(500);
        System.out.println(al);
        /*System.out.println(al.remove(1));
        System.out.println(al);


        //for loop
        *//*System.out.println("Reading elements using for loop....");
        for(int i=0;i<al.size();i++){
            al.get(i);
            System.out.println(al);
        }

        //for..each loop
        for(Object e:al){
            System.out.println(e);
        }*//*


        //iterator()
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
*/

            //sort()

            Collections.sort(al);
            System.out.println("after sorting"+al);

            Collections.sort(al,Collections.reverseOrder());
            System.out.println("Reverse order"+al);

            //shuffling
        Collections.shuffle(al);
        System.out.println("after shufflying"+al);

        //Array to ArrayList
        //Arrays.asList();
        }
    }
