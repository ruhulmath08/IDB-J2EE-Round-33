/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_17_09_2017;

/**
 *
 * @author J2EE-33
 */
public class numberCalculation {
    
    private double result = 0;

    public numberCalculation() {
    }
    
    public double addNum(int x, int y){
        //int sum =0;
        for (int z = x; z<= y; z++) {
            result += z;
        }
        return result;
    }
}
