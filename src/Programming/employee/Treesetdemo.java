package Programming.employee;

import java.util.TreeSet;

public class Treesetdemo {
    public static void main(String[] args) {

        TreeSet<Employee> employees =
                new TreeSet<>();

        employees.add(
                new Employee(103,
                        "Smith",
                        70000,"IT"));

        employees.add(
                new Employee(101,
                        "John",
                        50000,"ds"));

        employees.add(
                new Employee(102,
                        "David",
                        60000,"CS"));

        System.out.println(employees);

        System.out.println(employees.first());
        System.out.println(employees.last());
    }
}
