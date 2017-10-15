package createResult;

import java.util.Scanner;

public class PrimrNumber {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if (isPrime(num) == true) {
            System.out.println(num + " : is prime");
        } else {
            System.out.println(num + " : is not prime");
        }
    }

}
