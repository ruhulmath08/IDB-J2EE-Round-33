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
public class MetrhodOverloading {
    
    
    
    public static void main(String[] args) {
        CalculateAVG cavg = new CalculateAVG();
        // work with average() method
        System.out.println("Average of 2 num : "+cavg.average(10, 20));
        System.out.println("Average of 3 num : "+cavg.average(10, 20, 30));
        System.out.println("Average of 4 num : "+cavg.average(10, 20,30, 40));        
        System.out.println("Average of multiple num : "+cavg.average(10, 20, 30, 40, 50, 60, 70));
        
        // work with addNumber() method
        Statistics st = new Statistics();
        System.out.println('\n'+"Sum of 2 num : "+st.addNumber(10, 20));
        System.out.println("Sum of 3 num : "+st.addNumber(10, 20, 30));
        System.out.println("Sum of 4 num : "+st.addNumber(10, 20,30, 40));        
        System.out.println("Sum of multiple num : "+st.addNumber(10, 20, 30, 40, 50, 60, 70));
    }
    
}
