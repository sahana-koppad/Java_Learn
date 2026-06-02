package Programming.employee;

import java.util.LinkedList;

public class LinkedListdemo {
    public static void main(String args[]){
        LinkedList<Employee> employees=new LinkedList<>();

        //add()

        employees.add(new Employee(101,"john",200000,"IT"));
        employees.add(new Employee(102,"sahana",300000,"DataStructure"));
        employees.add(new Employee(103,"Ram",50000,"cs"));
        System.out.println(employees);
        //addFirst()
        employees.addFirst(new Employee(103,"sam",60000,"IP"));
        employees.addLast(new Employee(105,"Ankita",70000,"IS"));

        System.out.println(employees.getFirst());
        System.out.println(employees.getLast());

        System.out.println(employees.removeFirst());
        System.out.println(employees.removeLast());

        System.out.println(employees);

        for(Employee emp:employees){
            System.out.println(emp);
        }
    }
}
