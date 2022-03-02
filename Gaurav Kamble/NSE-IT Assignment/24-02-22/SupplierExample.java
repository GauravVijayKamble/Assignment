import java.util.function.*;
public class SupplierExample {

 public static void main(String[] args) {
Supplier<Double> s = ()->{
return Math.random();
};
System.out.println(s.get());
System.out.println(s.get());
}

}