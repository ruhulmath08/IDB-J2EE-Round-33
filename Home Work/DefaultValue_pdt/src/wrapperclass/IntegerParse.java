/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author J2EE-33
 */
public class IntegerParse {
    public static void main(String[] args) {
        String str = "300";
        int x = Integer.parseInt(str);
        int y = Integer.valueOf(str).intValue();
        System.out.println("Value of x : "+x);
        System.out.println("Value of y : "+y);
        
        int p = 10;
        long l = p;
        
        long ln = 1234567895;
        byte cin = (byte)ln;
        System.out.println(cin);
    }
    
}
