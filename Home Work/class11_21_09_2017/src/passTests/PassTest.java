
package passTests;

public class PassTest {
    public static int changeInt(int value){
        value = 55;
        return value;
    }
    
    public static int changeIntx(int value){
        return value;
    }    

    public static void main(String[] args) {
        int val;
        val = 11;
        int c = changeInt(val);
        int d = changeIntx(val);
        System.out.println("changeInt() method : "+c);
        System.out.println("changeIntx() method : "+d);
    }
    
}
