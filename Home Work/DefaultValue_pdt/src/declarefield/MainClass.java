/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declarefield;

import java.util.Date;

/**
 *
 * @author J2EE-33
 */
public class MainClass {
    public static void main(String[] args) {
        Stock st = new Stock("Money", 567.7, new Date());
        System.out.println("Symbol "+st.getSymbol()+ " Price : "+st.getPrice()+" Date :"+st.getDate());
    }
    
}
