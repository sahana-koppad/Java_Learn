package Programming.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListExample {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", 50000, "IT"));
        employees.add(new Employee(102, "David", 60000, "HR"));
        employees.add(new Employee(103, "Smith", 70000, "Finance"));


        for (Employee emp : employees) {
            System.out.println(emp);
        }
        //get employee
        System.out.println(employees.get(0));

        //update employee
        employees.set(1, new Employee(102, "David", 65000, "HR"));

        //remove employee

        //employees.remove(0);

        //search employee
        for(Employee emp : employees) {
            if(emp.id == 103) {
                System.out.println(emp);
            }
        }

        //sort by salary
        employees.sort((e1, e2) ->
                Double.compare(e1.salary, e2.salary));
        System.out.println(employees);

        //sort by name
        employees.sort((e1,e2)->
        e1.name.compareTo(e2.name));
        System.out.println(employees);

        //salary greater than 50000
        employees.stream().filter(emp->emp.salary>50000).forEach(System.out:: println);
    }
}