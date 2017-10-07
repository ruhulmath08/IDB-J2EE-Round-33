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
public class ForInLoop {
    private static int[] nums = {4,8,5,7,6};
    private static int bigNumber = 0;
    public static void main(String[] args) {
        for (int x : nums) {
            if(x>bigNumber){
                bigNumber = x;
            }
        }
        System.out.println(bigNumber);
    }
    
}
