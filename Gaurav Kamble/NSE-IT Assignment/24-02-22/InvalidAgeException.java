public class InvalidAgeException extends RuntimeException {
public InvalidAgeException() {
super("Age cannot be negative or more than 100 years");
}

}