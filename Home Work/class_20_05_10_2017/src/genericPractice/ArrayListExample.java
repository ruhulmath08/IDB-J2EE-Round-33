package genericPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ruhul");
        list.add("Jai");
        String s = list.get(1); //Typing casting is not required
        System.out.println(list.get(0)+" element is : "+s);
        
        Iterator<String> itr = list.iterator();
        /*
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
            
        }
        */
        for (String string : list) {
            System.out.println(string);
        }
    }
}
