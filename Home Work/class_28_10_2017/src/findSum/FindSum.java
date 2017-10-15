package findSum;

import java.util.Scanner;

public class FindSum {

    public static double findSum(int sv, int ev) {
        double sum = 0.0;
        if (sv < ev) {
            for (int i = sv; i <= ev; i++) {
                sum += i;
            }
            return sum;
        } else {
            for (int i = ev; i <= sv; i++) {
                sum += i;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int sval = sc.nextInt();

        System.out.print("Enter num1: ");
        int eval = sc.nextInt();

        System.out.println("Sum is : " + findSum(sval, eval));
    }
}
