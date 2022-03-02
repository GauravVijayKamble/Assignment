import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StuMarks {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList();
        List<Integer> data3 = new ArrayList();
        data.add(78);
        data.add(82);
        data.add(92);
        data.add(79);
        data.add(40);


        Stream s1 = data.stream();

        Predicate<Integer> p = x->x>= 80;

        long cnt = s1.filter(p).count();
        System.out.println("The numbers is greater than 80:");
        System.out.println(cnt);
        s1.close();

    }

}