package minJava;

import java.util.Scanner;

public class MinJava {
    
    public static int getMinValue(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[5];        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter number");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        System.out.println("Min number : "+getMinValue(arr));
    }
    
}
