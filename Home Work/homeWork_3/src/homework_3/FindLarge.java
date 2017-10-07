package homework_3;

import java.util.Scanner;

public class FindLarge {

    public static void main(String[] args) {
        int a, b, c, d, e;
        int i;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five value : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();        
        boolean flag = false;
        for (i = a + b + c + d + e; flag == false; i--) {
            if (i == a || i == b || i == c || i == d || i == e) {
                flag = true;
            }
        }
        i++;
        System.out.println("Input value is : " + a + " " + b + " " + c + " " + d + " " + e);
        System.out.println("Large value is : " + i);
    }

}
