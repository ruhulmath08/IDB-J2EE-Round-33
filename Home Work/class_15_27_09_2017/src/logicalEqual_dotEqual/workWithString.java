
package logicalEqual_dotEqual;

public class workWithString {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "He"+"llo";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        //s3=s4;
        
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
    
}
