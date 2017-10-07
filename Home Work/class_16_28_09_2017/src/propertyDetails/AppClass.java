/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertyDetails;

/**
 *
 * @author J2EE-33
 */
public class AppClass {

    public static void main(String[] args) {
        Father father = new Father();
        Child child = new Child("Kamal", 20000000.0, 10000000.0, 25);
        System.out.println("Father details");
        father.setfName("Abdur Rahim");
        System.out.println("Father name : " + father.getfName());
        System.out.println("Father Property : " + father.getfProperty());
        System.out.println("Father remaining property : " + child.fremainBalance(50000000.0));
        
        System.out.println("Child details");
        System.out.println("Child name : "+child.getcName());
        System.out.println("Child Property : "+child.getcProperty());
        System.out.println("Child age : "+child.getAge());
    }
}
