import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int htno;
    String name;
    String branch;
    public Student(int htno, String name, String branch) {
        super();
        this.htno = htno;
        this.name = name;
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Student [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
    }

}

class HtnoComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        if(o1.htno> o2.htno)
            return 1;
        else if(o1.htno < o2.htno)
            return -1;
        else
            return 0;
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.name.compareTo(o2.name);
    }
}

class BranchComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.branch.compareTo(o2.branch);
    }
}
public class comparatorExample {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList();
        studs.add(new Student(1001,"praveen","cse"));
        studs.add(new Student(3021,"anil","eee"));
        studs.add(new Student(2031,"kishore","mech"));
        studs.add(new Student(4976,"sunny","biotech"));
        Comparator<Student> c1 = (s1,s2)-> {
            if(s1.htno > s2.htno)
                return 1;
            else if(s1.htno < s2.htno)
                return -1;
            else
                return 0;
        };
        Comparator<Student> c2 = (s1,s2)-> s1.name.compareTo(s2.name);
        Comparator<Student> c3 = (s1,s2)-> s1.branch.compareTo(s2.branch);

        Collections.sort(studs, c1);
        System.out.println("Sorted on htno..");
        for(Student s : studs)
            System.out.println(s);

        Collections.sort(studs, c2);
        System.out.println("Sorted on name basis..");
        for(Student s : studs)
            System.out.println(s);
        
        Collections.sort(studs, c3);
        System.out.println("Sorted on branch basis..");
        for(Student s : studs)
            System.out.println(s);

    }

}