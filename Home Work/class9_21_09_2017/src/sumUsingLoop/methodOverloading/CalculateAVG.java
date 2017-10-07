/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumUsingLoop.methodOverloading;

/**
 *
 * @author J2EE-33
 */

public class CalculateAVG {
    public float average(int x1, int x2)
    {
        return (x1 + x2)/2;
    }
    public float average(int x1, int x2, int x3)
    {
        return (x1 + x2+x3)/3;
    }
    public float average(int x1, int x2, int x3, int x4)
    {
        return (x1 + x2+x3+x4)/4;
    }
    
    //method use variable argument
    public float average(int ...arg){
        int sum = 0;
        for (int i : arg) {
            sum += i;
        }
        return ((float)sum)/arg.length;
    }
}
