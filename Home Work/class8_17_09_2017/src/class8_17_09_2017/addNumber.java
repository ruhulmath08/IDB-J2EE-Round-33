package class8_17_09_2017;

import java.util.Scanner;

public class addNumber {
    

    public static void main(String[] args) {
        
        numberCalculation calculation = new numberCalculation();
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter start value : ");
         int a = sc.nextInt();
         System.out.print("Enter start value : ");
         int b = sc.nextInt();
         double c = calculation.addNum(a, b);
         System.out.println("Sum of "+a+" and "+b+" is : "+c);
       
    }
    
}
