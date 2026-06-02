package Programming.employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeSetdemo {
    public static void main(String[] args) {
        Set<Employee> set=new HashSet<>();

        set.add(new Employee(1,"john",10000,"IT"));
        set.add(new Employee(2,"sahana",50000,"CS"));
        set.add(new Employee(1,"john",50000,"DS"));//duplicate so it will not add


        for(Employee emp:set){
            System.out.println(emp);
        }
        //emp exist
        System.out.println(set.contains(new Employee(1,"john",10000,"IT")));

    }
}
