
package sumUsingLoop.methodOverloading;

public class Statistics {
    public int addNumber(int x1, int x2){
        return x1+x2;
    }
    
    public int addNumber(int x1, int x2, int x3){
        return x1+x2+x3;
    }
    
    public int addNumber(int x1, int x2, int x3, int x4){
        return x1+x2+x3+x4;
    }
    
    public int addNumber(int x1, int x2, int x3, int x4, int x5){
        return x1+x2+x3+x4+x5;
    }
    
    public int addNumber(int ... num){
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return  sum;
    }
}
