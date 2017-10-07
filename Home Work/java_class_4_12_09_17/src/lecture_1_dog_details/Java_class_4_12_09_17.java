/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_1_dog_details;

/**
 *
 * @author J2EE-33
 */
public class Java_class_4_12_09_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog d = new Dog("Tommy", "Red", "American", 12);
       
        System.out.println("Name : "+d.getName());
        System.out.println("Color : "+d.getColor());
        System.out.println("Race : "+d.getRace());
        System.out.println("Age : "+d.getAge());
    }
    
}
