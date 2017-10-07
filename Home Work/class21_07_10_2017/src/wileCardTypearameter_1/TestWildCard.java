package wileCardTypearameter_1;

import java.util.List;

public class TestWildCard {

    public static void insertElement(List<? super A> list) {
        list.add(new A());
        list.add(new B());
        list.add(new C());
        //list.add(new D()); //cannot add D because it is not a chld of A
    }
}
