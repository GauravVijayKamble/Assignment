package Gaurav;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employee extends Object{
    int empid;
    String name;
    String dept;
    public Employee() {
    }
    public Employee(int empid, String name, String dept) {
        super();
        this.empid = empid;
        this.name = name;
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
    }

}
public class EmployeeListExample {

    public static void main(String[] args) {
        List<Employee> ar = new LinkedList();
        Employee emp1 = new Employee(1001,"Kumar","IT");
        Employee emp2 = new Employee(9021,"Sunil","Marketing");
        Employee emp3 = new Employee(5329,"Babji","QA");
        Employee emp4 = new Employee(2245,"John","Operations");
        ar.add(emp1);
        ar.add(emp2);
        ar.add(emp3);
        ar.add(emp4);
        System.out.println(ar);
        Iterator itr = ar.iterator();
        while(itr.hasNext()) {
            Employee emp = (Employee) itr.next();
            System.out.println(emp.empid+" "+emp.name+" "+emp.dept);
        }

        System.out.println("By using for loop");
        for(Employee e: ar) {
            System.out.println(e.empid+" "+e.name+" "+e.dept);
        }
        ar.forEach(System.out::println);
    }

}