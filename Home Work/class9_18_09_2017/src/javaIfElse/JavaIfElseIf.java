/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaIfElse;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class JavaIfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check negative, positive or nutral number");
        System.out.print("Enter number : ");
        double d = sc.nextFloat();
        if (d==0) {
            System.out.println(d+" is nutral number");
        } else if(d>=0){
            System.out.println(d+" is positive number");
        }else{
            System.out.println(d+" is negative number");
        }
    }
    
}
