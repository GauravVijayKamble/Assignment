public class TestAge {
public void checkAge(int age) {
if(age < 0 || age >100)
throw new InvalidAgeException();
else if( age >=0 && age <=17 )
throw new InSufficentAgeException();
else
System.out.println("You are eligible for voting.....");
}

}