/*
D:\Users\J2EE-33\Desktop\java>java TestAssertion
Enter your age : 11
value is : 11

D:\Users\J2EE-33\Desktop\java>java -ea SimpleJava
Hello Java

D:\Users\J2EE-33\Desktop\java>java -ea TestAssertion
Enter your age : 2
Exception in thread "main" java.lang.AssertionError: Not valid
        at TestAssertion.main(TestAssertion.java:9)

D:\Users\J2EE-33\Desktop\java>java TestAssertionttt
Error: Could not find or load main class TestAssertionttt

D:\Users\J2EE-33\Desktop\java>
 */
package assertionTest;

import java.util.Scanner;

public class TestAssertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");

        int value = sc.nextInt();
        assert value >= 18 : "Not valid";
        /*
            enable asert in netBeans     
            Right click on your project > Properties > Run > VM Options
            Add -ea in the box
        */
        System.out.println("value is : " + value);
    }

}
