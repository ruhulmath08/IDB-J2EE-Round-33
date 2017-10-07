
package toStringMethod;

import java.util.Date;

public class ToString {
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println(date);
        System.out.println("After toString() : "+date.toString());
        
        String x = "10";
        int y = Integer.parseInt(x);
        String z = Integer.toString(y);
        System.out.println(x+y+z);
        
        String s = x+y+z;
        System.out.println(s);
    }
}
