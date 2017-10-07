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
public class CalculateSumDoWhile {
    private int sum = 0;
    
    public int addNumDoWhile(int sv, int ev){
        do {            
            sum += sv;
            sv++;
        } while (sv <= ev);
        return sum;
    }
    
}
