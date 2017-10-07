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
public class Cat implements Animal{

    @Override
    public void run() {
        System.out.println("Cat can run");
    }

    @Override
    public void eat() {
        System.out.println("Cat can eat");
    }

    @Override
    public void bit() {
        System.out.println("Cat can bit");
    }

    @Override
    public void sleep() {
        System.out.println("Cat can sleep");
    }
    
}
