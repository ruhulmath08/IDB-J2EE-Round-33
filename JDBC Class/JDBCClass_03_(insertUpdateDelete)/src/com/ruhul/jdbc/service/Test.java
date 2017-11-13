package com.ruhul.jdbc.service;

import com.ruhul.jdbc.domain.Student;
import java.util.List;

public class Test {
    static StudentService studentService;
    public static void main(String[] args) {
        studentService = new StudentService();
        //insert data
         /*
        Student std1 = new Student(1001, "Ruhul");
        studentService.save(std1);
        Student std2 = new Student(1002, "Urmi");
        studentService.save(std2);
        Student std3 = new Student(1003, "Shahrier");
        studentService.save(std3);
        
        /*
        Student std2 = new Student(1001, "Md.Ruhul Amin");
        studentService.update(std2);
       
        studentService.delete(1001);
         
         List<Student> list = studentService.getStudents();
         for (Student s : list) {
             System.out.println("ID : "+s.getId()+"\nName : "+s.getStudentName());
             System.out.println("");
        }
        */
         Student s = studentService.getStudent(1001);
         System.out.println("ID : "+s.getId()+"\nName : "+s.getStudentName());
    }
}
