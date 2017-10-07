/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumUsingLoop;

/**
 *
 * @author J2EE-33
 */
public class SumUsingForloop {
    
    public int addNumberFloop(int sv, int ev){
        int sum = 0;
        for (int i = sv; i<=ev; i++) {
            sum += i;
        }
        return sum;
    }
    
    public int addNumWhileLoop(int sv, int ev){
        int sum = 0;
        while (sv <= ev) {            
            sum += sv;
            sv++;
        }        
        return sum;
    }
    
    public int addNumDoWhile(int sv, int ev){
        int sum = 0;
        do { 
            sum += sv;
            sv++;
        } while (sv <= ev);
        return sum;
    }
}
