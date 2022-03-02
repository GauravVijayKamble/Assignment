import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentHashMapExample {
 public static void main(String[] args) {
ArrayList<Integer> subject1 = new ArrayList();
ArrayList<Integer> subject2 = new ArrayList();
ArrayList<Integer> subject3 = new ArrayList();
subject1.add(56);
subject1.add(45);
subject1.add(23);
subject1.add(34);
subject2.add(56);
subject2.add(67);
subject2.add(12);
subject2.add(90);
subject3.add(38);
subject3.add(78);
subject3.add(46);
subject3.add(19);
HashMap<String,List> results = new HashMap();
results.put("History",subject1);
results.put("English",subject2);
results.put("Math",subject3);
System.out.println(results);
Set<Map.Entry<String, List>> entries = results.entrySet();
Iterator itr = entries.iterator();
while(itr.hasNext()) {
Map.Entry<String,List> temp = (Entry<String, List>) itr.next();
List<Integer> subject = temp.getValue();
int sum=0;
for(Integer i :subject)
sum=sum+i;
System.out.println("Name: "+temp.getKey()+" "+"Total: "+sum);
}
 }
}