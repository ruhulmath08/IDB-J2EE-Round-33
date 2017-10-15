package compairValue;

import java.util.Scanner;

public class CompairTwoValue {
    
    public static double compairValue(double n1, double n2){
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter num1: ");
         double n1 = sc.nextDouble();
         System.out.print("Enter num2: ");
         double n2 = sc.nextDouble();
         
         System.out.println("Large value is : "+compairValue(n1, n2));
    }
    
}
