import java.util.*;
public class ArrayListExample {

    public static void main(String[] args) {
        LinkedList<String> ar = new LinkedList();
        ar.add("India");
        ar.add("China");
        ar.add("Japan");
        ar.add("Nepal");
        ar.add("Nepal");
        System.out.println(ar);
        ArrayList<String> ar1 = new ArrayList();
        ar1.add("America");
        ar1.add("Aus");
        ar1.add(null);
        ar1.add(null);
        ar.addAll(ar1);
        System.out.println(ar);
        ar.remove("China");
        System.out.println(ar);
        if(ar.contains("China"))
            System.out.println("India found in the list");
        else
            System.out.println("Not found in the list...");
        System.out.println(ar.size());
        Iterator itr = ar.iterator();
        System.out.println("Traversing using iterator");
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("Traversing using for loop");
        for(String s: ar) {
            System.out.println(s);
        }
        System.out.println("Traversing using forEach method...");
        ar.forEach(System.out::println);


    }

}