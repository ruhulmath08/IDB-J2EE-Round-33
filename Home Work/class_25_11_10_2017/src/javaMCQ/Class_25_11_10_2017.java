/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaMCQ;

/**
 *
 * @author J2EE-33
 */
public class Class_25_11_10_2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int w = (int) 888.8;
        byte x = (byte) 100L;
        long y = (byte) 100;
        byte z = (byte) 100L;
        System.out.println(w + " " + x + " " + y + " " + z);
     
        double num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};
        double result;
        result = 0;
        for (int i = 0; i < 6; ++i) {
            result = result + num[i];
        }
        System.out.print(result / 6);
         */
 /*
        double a, b, c;
        a = 3.0 / 0;
        b = 0 / 4.0;
        c = 0 / 0.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
         */
 /*
        double r, pi, a;
        r = 9.8;
        pi = 3.14;
        a = pi * r * r;
        System.out.println(a);
         */
 /*
        char array_variable[] = new char[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.println("["+i+"]"+array_variable[i] + "");
            i++;
        }
         */
 /*
        char a = 'A';
        a++;
        System.out.println((int) a);
         */
        int a[] = {1, 2, 3, 4, 5};
        int d[] = a;
        int sum = 0;
        for (int j = 0; j < 3; ++j) {
            sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
        }
        System.out.println(sum);
    }

}
