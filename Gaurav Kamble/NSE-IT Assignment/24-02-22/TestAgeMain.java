import java.util.Scanner;

public class TestAgeMain {

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age..");
int age = sc.nextInt();
TestAge t = new TestAge();
try {
t.checkAge(age);
}
catch(InSufficentAgeException e) {
System.out.println(e);
}
catch(InvalidAgeException e) {
System.out.println(e);
}

 }

}