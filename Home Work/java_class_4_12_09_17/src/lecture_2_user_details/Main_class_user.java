/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_2_user_details;

/**
 *
 * @author J2EE-33
 */
public class Main_class_user {
    public static void main(String[] args) {
        User user = new User(01, "Ruhul", 25000.0, "ruhulmath08@gmail.com");
        
        System.out.println("Id Number : "+user.getId());
        System.out.println("Name : "+user.getName());
        System.out.println("Salary : "+user.getSalary());
        System.out.println("Email : "+user.getEmail());
    }
    
    
}
