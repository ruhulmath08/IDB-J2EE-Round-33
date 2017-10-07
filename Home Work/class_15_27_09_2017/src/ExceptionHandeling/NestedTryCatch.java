/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandeling;

/**
 *
 * @author J2EE-33
 */
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("uuu");
        }
    }
}
