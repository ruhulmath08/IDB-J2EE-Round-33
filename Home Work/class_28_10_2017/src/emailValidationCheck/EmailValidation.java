package emailValidationCheck;

import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if ((atpos > 1) && (atpos <dotpos) ) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
        
    }
}
