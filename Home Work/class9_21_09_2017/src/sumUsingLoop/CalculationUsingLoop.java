package sumUsingLoop;

public class CalculationUsingLoop {
    public static void main(String[] args) {
        SumUsingForloop s = new SumUsingForloop();
        
        int c = s.addNumberFloop(1, 100);
        System.out.println("Sum in for : "+c);
        
        int e = s.addNumWhileLoop(1, 100);
        System.out.println("Sum in while : "+e);
        
        int d = s.addNumDoWhile(1, 100);
        System.out.println("Sum in do while : "+d);   
    }
    
}
