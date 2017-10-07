/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceExample;

/**
 *
 * @author J2EE-33
 */
public class AppClass extends Cat{
    public static void main(String[] args) {
        AppClass ac = new AppClass();
        ac.run();
        ac.eat();
        ac.bit();
        ac.sleep();
    }
}
