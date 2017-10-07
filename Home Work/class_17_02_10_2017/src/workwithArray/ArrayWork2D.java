package workwithArray;

public class ArrayWork2D {

    public static void main(String[] args) {
        int[][] array2D = new int[2][3];
        array2D[0][0] = 1;
        array2D[0][1] = 3;
        array2D[0][2] = 5;

        array2D[1][0] = 2;
        array2D[1][1] = 6;
        array2D[1][2] = 9;
        
        for(int[] array1D : array2D){
            for (int item : array1D) {
                System.out.print(" "+item);
            }
            System.out.println("");
        }
        
        /*
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+array2D[i][j]);

            }
            System.out.println("");
        }
       */
    }
}
