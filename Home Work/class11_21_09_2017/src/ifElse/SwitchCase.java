/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElse;

/**
 *
 * @author J2EE-33
 */
public class SwitchCase {
    
    private int x;
    
    public void ptintHello(int x){
        this.x = x;
        switch( x){
            case 1:
                System.out.println("Hello world");
                break;
            case 2:
                System.out.println("Hello Java");
                break;
            default:
                System.out.println("Hello some others");
                break;
        }
    }
    
}
