package arraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class ASusingMethod {
    
    
    public static void sortingArray(int[][] n){
        for (int[] d : n) {
            Arrays.sort(d);
            for (int i : d) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        System.out.println("Row-1");
        System.out.println("Enter Number");
        array[0][0]=sc.nextInt();
        //System.out.println("Enter Number");
        array[0][1]=sc.nextInt();
        //System.out.println("Enter Number");
        array[0][2]=sc.nextInt();
        
        System.out.println("Row-2");
        //System.out.println("Enter Number");
        array[1][0]=sc.nextInt();
        //System.out.println("Enter Number");
        array[1][1]=sc.nextInt();
        //System.out.println("Enter Number");
        array[1][2]=sc.nextInt();
        sortingArray(array);
    }
}
