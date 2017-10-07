
package ExceptionHandeling;

import java.util.Scanner;

public class AddArgument {
    public static void main(String[] args) {
        args = new String[4];
        args[0]="1";
        args[1]="1";
        args[2]="1";
        args[3]="1";
      
        try {
            int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);            
        }
            System.out.println("Sum : " +sum);
        } catch (NumberFormatException nfe) {
            System.err.println("One of the value is not a number");
        }
    }
    
}
