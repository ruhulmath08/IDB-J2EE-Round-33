package ComparatorPage228;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        Comparator c = new NameComparator();
        TreeSet studentSet = new TreeSet(c);
        studentSet.add(new Student("Mike", "Hauffmamn", 101, 4.0));
        studentSet.add(new Student("John", "Lynn", 102, 2.8));
        studentSet.add(new Student("Jim", "Max", 103, 3.6));
        studentSet.add(new Student("Kelly", "Grant", 104, 2.3));
        
        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object object : studentArray) {
            s = (Student)object;
            System.out.println("Full Name :"+(s.getFirstName()+" "+s.getLastName()));
            System.out.println("Student Id :"+s.getStudentId());
            System.out.println("GPA :"+s.getGPA());
            System.out.println("----------------");
        }
    }
}
