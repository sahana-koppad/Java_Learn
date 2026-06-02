package Programming.employee;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;
    String department;

    // Constructor
    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    //equals()

    public boolean equals(Object obj){// id same --->true    //not same
        Employee e=(Employee)obj;
        return this.id==e.id;
    }
    @Override
    public int hashCode(){ //
        return id;
    }

    public int compareTo(Employee e){
        return this.id-e.id;
    }

    // toString()
    public String toString() {

        return id + " " + name + " " + salary + " " + department;
    }
}