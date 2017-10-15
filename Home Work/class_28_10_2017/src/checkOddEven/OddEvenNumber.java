package checkOddEven;

import java.util.Scanner;

public class OddEvenNumber {

    public static String checkOddEven(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();

        System.out.println(n1 + " is " + checkOddEven(n1));
    }
}
