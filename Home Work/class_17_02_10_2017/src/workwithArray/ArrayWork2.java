/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithArray;

public class ArrayWork2 {
    public static void main(String[] args) {
        int[][] array2D = {{1, 3, 5}, {2, 6, 9}, {2, 6, 9, 8}, {1, 1}, {8}};
        
        for(int[] array1D : array2D){
            for (int item : array1D) {
                System.out.print(" "+item);
            }
            System.out.println("");
        }
    }
}
