import java.util.PriorityQueue;
class Studt implements Comparable<Studt>{
    int htno;
    String name;
    String branch;
    public Studt(int htno, String name, String branch) {
        super();
        this.htno = htno;
        this.name = name;
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Studt [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
    }
    @Override
    public int compareTo(Studt o) {
        return this.name.compareTo(o.name);
    }

}

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(45);
        System.out.println(pq);
        pq.add(2);
        pq.add(30);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        PriorityQueue<Studt> studs = new PriorityQueue();
        studs.add(new Studt(1001,"praveen","cse"));
        studs.add(new Studt(3021,"anil","eee"));
        studs.add(new Studt(2031,"kishore","mech"));
        studs.add(new Studt(4976,"sunny","biotech"));
        for(Studt s : studs)
            System.out.println(s);
        studs.remove();
        System.out.println("After removal ");
        for(Studt s : studs)
            System.out.println(s);
    }
}