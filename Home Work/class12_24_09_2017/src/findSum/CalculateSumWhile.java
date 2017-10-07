/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findSum;

/**
 *
 * @author J2EE-33
 */
public class CalculateSumWhile {
    private int sum = 0;
    public int addNumWhile(int sv, int ev){
        while (sv <= ev) {            
            sum += sv;
            sv++;
        }
        return sum;
    }
    
}
