/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogExample;

/**
 *
 * @author J2EE-33
 */
public class AppClacc {
    public static void main(String[] args) {
        //DogDetails dd = new DogDetails("Tommy", "red", 2.2d);
        DogDetails dd = new DogDetails();
        dd.setName("Tommy");
        dd.setColor("Red");
        dd.setHight(2.2d);
        System.out.println("Dog name is : "+dd.getName());
        System.out.println("Dog color is : "+dd.getColor());
        System.out.println("Dog height is : "+dd.getHight());
    }
}
