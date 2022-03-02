import java.util.function.Consumer;

public class ConsumerExample {

 public static void main(String[] args) {

Consumer<Employee> con = e->{
System.out.println("Name: "+e.name);
System.out.println("Desgination: "+e.desg);
System.out.println("Salary: "+e.salary);
};
Employee emp1 = new Employee("Kumar","Manager", 5000);
Employee emp2 = new Employee("Sunil","Clerk", 3500);
con.accept(emp1);
con.accept(emp2);

 }

}