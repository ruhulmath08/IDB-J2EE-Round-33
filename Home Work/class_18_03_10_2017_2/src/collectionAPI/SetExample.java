package collectionAPI;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("One");
        set.add("second");
        set.add("3rd");
        set.add(new Integer(4));
        set.add(new Float(5.0f));
        set.add("second");          //duplicate, not added
        set.add(new Integer(4));    //duplicate, not added
        System.out.println(set);
    }
    
}
