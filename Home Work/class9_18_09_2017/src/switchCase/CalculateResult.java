package switchCase;

import java.util.Scanner;

public class CalculateResult {
    public static void main(String[] args) {
        System.out.println("Calculate result");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject marks");
        System.out.print("Bangla: ");
        double b = sc.nextDouble();
        System.out.print("English: ");
        double e = sc.nextDouble();
        System.out.print("Mathematics: ");
        double m = sc.nextDouble();
        
        double total = b+e+m;
        
        if(b<33 || e<33 || m<33){
            System.out.println("Fail!. Try next time");
            System.out.println("Total marks"+total+'\n'+"Bangla : "+b+'\n'+"English : "+e+'\n'+"Mathematics : "+m);
        }
        else if(total >= 33 && total < 135){
            System.out.println("Third class!. Study more");
            System.out.println("Total marks"+total+'\n'+"Bangla : "+b+'\n'+"English : "+e+'\n'+"Mathematics : "+m);
        }
        else if(total >= 135 && total < 180){
            System.out.println("Second class!. Not good");
            System.out.println("Total marks"+total+'\n'+"Bangla : "+b+'\n'+"English : "+e+'\n'+"Mathematics : "+m);
        }
        else{
            System.out.println("Second class!. Good!!");
            System.out.println("Total marks"+total+'\n'+"Bangla : "+b+'\n'+"English : "+e+'\n'+"Mathematics : "+m);
        }        
    }
}
