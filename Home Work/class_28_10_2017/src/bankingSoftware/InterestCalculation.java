package bankingSoftware;

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal : ");
        float principal = sc.nextFloat();
        System.out.print("Enter time(years) : ");
        float time = sc.nextFloat();
        System.out.print("Enter rate : ");
        float rate = sc.nextFloat();
        
        float interest = calculateInterest(principal, rate, time);
        float total = interest+principal;
        System.out.println("Interest : "+interest+"\nTotal : "+total);
    }
    
    public static float calculateInterest(float principal, float rate, float time){
        float interest = (principal*rate*time)/100;
        return interest;
    }
}
