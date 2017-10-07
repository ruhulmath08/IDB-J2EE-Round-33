/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoboxingWithCollection;

import java.util.ArrayList;

/**
 *
 * @author J2EE-33
 */
public class AutWColl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 5);
        list.add(0, 4);
        int p = list.get(0);
        System.out.println(p);
        System.out.println(list);
    }
}
