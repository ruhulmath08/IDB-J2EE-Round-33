package wileCardTypearameter_2;

import java.util.ArrayList;
import java.util.List;

public class TestwileCard {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        listA.add(new A("Rahim"));
        processEliments(listA);
        
        //Again...
        List<B> listB = new ArrayList<B>();
        listB.add(new B(50.0));
        listB.add(new B(20.0));
        processEliments(listA);
        
        //Again...
        List<A> listAc = new ArrayList<A>();
        listAc.add(new A("Karim"));
        listAc.add(new A("Halim"));
        processElimentsBitDifferent(listAc);
    }
    
    public static void processEliments(List<?> elements){
        
        for (Object o : elements) {
            System.out.println(o);
        }
    }
    
    public static void processElimentsBitDifferent(List<? extends A> elements){
        for (A a : elements) {
            
            System.out.println(a.getName());
        }
    }
}
