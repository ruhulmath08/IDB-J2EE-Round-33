package ComparatorPage228;

public class CompairInterface {

    public static void main(String[] args) {
        Student s1 = new Student("Ruhul", "Amin", 123456, 3.50);
        Student s2 = new Student("Sanjida", "Nasrin", 1230074, 3.70);        
        NameComparator nc = new NameComparator();
        System.out.println("Compare : "+(nc.compare(s2, s1)));
        
        GradeComparator gc = new GradeComparator();
        System.out.println("Compare Grade: "+(gc.compare(s2, s1)));
    }

}
