import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithOutStreamExample {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList();
        List<Integer> data3 = new ArrayList();
        data.add(10);
        data.add(12);
        data.add(22);
        data.add(24);
        data.add(40);
/*
for(Integer x : data) {
if(x%4==0)
data.add(x);
}
*/
//System.out.println("The numbers divisible by 4 are: "+data1);

        Stream s1 = data.stream();
//Stream s2= data.stream();
        Predicate<Integer> p = x->x%4==0;
// List<Integer> data2= (List<Integer>) s1.filter(p).collect(Collectors.toList());
        long cnt = s1.filter(p).count();
        System.out.println("The numbers divisible by 4 are:");
        System.out.println(cnt);
        s1.close();
/*
Function<Integer,Integer> f = x->x+5;
data3 = (List<Integer>) s2.map(f).collect(Collectors.toList());
System.out.println("The inc of 5 to list are:");
System.out.println(data3);
*/
//s2.close();
    }

}