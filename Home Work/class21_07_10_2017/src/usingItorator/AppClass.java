/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingItorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class AppClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Ruhul", " Amin", 123456, 3.30));
        list.add(new Student("Shohan", " Islan", 458961, 4.0));
        list.add(new Student("Shahirer", " Islam", 256345, 3.60));
        
        Iterator<Student> elements = list.iterator();
        while (elements.hasNext()) {
            Student next = elements.next();
            System.out.println("First Name : "+next.getFirstName()+"\nLastName : "
                    +next.getLastName()+"\nID : "+next.getStudentId()+"\nGPA : "+next.getGPA());
            System.out.println("----------------");
            
        }
    }
}
