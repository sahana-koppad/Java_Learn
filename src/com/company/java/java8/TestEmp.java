package com.company.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
     String name;
     int eno;
     Employee(String name,int eno){
         this.name=name;
         this.eno=eno;
     }
     public String toString(){
         return name+":"+eno;
     }
 }
public class TestEmp {
    public static void main(String[] args) {
        /*Employee e=new Employee("sahana",100);
        System.out.println(e);*/ //internally whenever we are trying to print object reference ToString() method is called
        ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee("sahana",100));
        l.add(new Employee("ram",102));
        l.add(new Employee("sham",103));
        l.add(new Employee("sakshi",104));
        //Comparator<Employee> c=(e1,e2)->e1.eno<e2.eno?-1:e1.eno>e2.eno?+1:0;
        Comparator<Employee> c=(e1,e2)->e1.name.compareTo(e2.name);
        Collections.sort(l,c);
        System.out.println(l);

        //arrange all emp objects to sorting order?




    }
}
