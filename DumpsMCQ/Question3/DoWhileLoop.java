package Question3;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 1, j = 10;
        do{
            if (i++ < --j) {
                //System.out.println("i = "+i+" and j = "+j);
                continue;
            }
        }
        while (i < 5);
        System.out.println("i = "+i+" and j = "+j);
    }
}
