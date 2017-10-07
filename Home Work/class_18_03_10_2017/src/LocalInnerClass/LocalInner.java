/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocalInnerClass;

/**
 *
 * @author J2EE-33
 */
public class LocalInner {
    private int data = 30;
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local local = new Local();
        local.msg();
    }
    
    public static void main(String[] args) {
        LocalInner outerClass = new LocalInner();
        outerClass.display();
    }
}
