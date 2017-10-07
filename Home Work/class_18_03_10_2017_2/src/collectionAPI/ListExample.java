package collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("second");
        list.add("3rd");
        list.add(new Integer(4));
        list.add(new Float(5.0f));
        list.add("second");          //duplicate, is added
        list.add(new Integer(4));    //duplicate, is added
        System.out.println(list);
    }
}
