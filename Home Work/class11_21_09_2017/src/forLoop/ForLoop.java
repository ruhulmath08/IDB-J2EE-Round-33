package forLoop;

public class ForLoop {
   // private   int x;
   // public   int sum = 0;
    
    public int addNumber(int n1, int n2){
        int sum = 0;
        for (int i = n1; i<=n2 ; n1++) {
            sum += i;
        }
        return sum;
    }
}
