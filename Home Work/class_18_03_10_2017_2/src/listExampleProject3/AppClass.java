package listExampleProject3;

import java.util.ArrayList;
import java.util.List;

public class AppClass {

    public static void main(String[] args) {
        Student s1 = new Student(1234652, "Ruhul", Subject.J2EE, new Thana("Naogaon", 6500), 40000);
        Student s2 = new Student(1234567, "Rakib", Subject.DDD, new Thana("Naogaon", 6500), 30000);
        Student s3 = new Student(1234654, "Rabby", Subject.WPSI, new Thana("Naogaon", 6500), 35000);
        Student s4 = new Student(1234789, "Momota Momo", Subject.DDD, new Thana("Dinagpur", 5201), 40000);
        Student s5 = new Student(1234567, "Sanjana Hossain", Subject.J2EE, new Thana("Pabna Sadar", 6600), 34000);
        Student s6 = new Student(1234567, "Sanjida Nasrin", Subject.J2EE, new Thana("Nohakhali Sador", 3800), 34000);

        List<Student> studentlist = new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);
        studentlist.add(s5);
        /*
        for (Student p : studentlist) {
            System.out.println("Student Id : " + p.getStudentId());
            System.out.println("Student Name : " + p.getStudentName());
            System.out.println("Student Subject : " + p.getSubject());
            System.out.println("Home district : " + p.district.getDistrictName());
            System.out.println("District code : " + p.district.getDistrictZepCode());
            System.out.println("Salary : " + p.getSalary());
            System.out.println("--------------------------------------------------");
        }
        */
        for (Student p : studentlist) {
            if (p.district.getDistrictName().equals("Naogaon") && (p.getSubject() == Subject.J2EE)) {
                System.out.println("Student Id : " + p.getStudentId());
                System.out.println("Student Name : " + p.getStudentName());
                System.out.println("Student Subject : " + p.getSubject());
                System.out.println("Home district : " + p.district.getDistrictName());
                System.out.println("District code : " + p.district.getDistrictZepCode());
                System.out.println("Salary : " + p.getSalary());
                System.out.println("--------------------------------------------------");
            }
        }

    }
}
