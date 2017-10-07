
package logicalEqual_dotEqual;

public class AppClass {
    public static void main(String[] args) {
        String x = "10";
        int y = 5;
        int z = Integer.parseInt(x);
        System.out.println("Addition is : "+(y+z));
        System.out.println("Substraction is : "+(z-y));
        System.out.println("Divission is : "+(z/y));
        
        String s1 = "Hello";
        String s2 = "He"+"llo";
        if (s1 == s2) {
            System.out.println("Strictly equal");
        }
        if (s1.equals(s2)) {
            System.out.println("Normaly equal");
        }
        
        String s4 = Integer.toString(y, 10);
        String s5 = Integer.toString(y);
        Integer integer = new Integer(y);
        System.out.println(integer instanceof Integer);
        
        int p[]={1,2,3,4};
        System.out.println(""+p[2]);
    }
}
