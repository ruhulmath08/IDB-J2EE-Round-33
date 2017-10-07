package findSum;

import java.util.Scanner;

public class CalculateSumFor {
    private int sum = 0;
    public int addNum(int sv, int ev){
        for(int i = sv; i<=ev; i++){
            sum += i;
        }
        return  sum;
    }
}
