/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createResult;

import java.util.Scanner;

/**
 *
 * @author J2EE-33
 */
public class AppClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name :");
        String sName = sc.nextLine();
        System.out.print("Enter Student id :");
        int sId = sc.nextInt();
        PassFail pf = new PassFail(sName, 1234652);
        
        System.out.println("Enter Student Marks :");
        System.out.print("Written marks:");
        int wrMarks = sc.nextInt();
        System.out.print("Evidence marks:");
        int evMarks = sc.nextInt();
        
        System.out.println("***Result***");
        System.out.println("Student name : "+pf.getName());
        System.out.println("Student Id : "+pf.getStudentId());
        pf.passFail(wrMarks, evMarks);
    }
    
}
