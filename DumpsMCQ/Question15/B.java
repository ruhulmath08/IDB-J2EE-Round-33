package Question15;

public class B extends A{
    public int method1(int a, int b) { return 0; }
    //private int method1(int a, int b) { return 0; }
    private int method1(int a, long b) { return 0; }
    //public short method1(int a, int b) { return 0: }
    //static protected int method1(int a, int b) { return 0; }
    
    /*
        child class method should be equal or more accessable than parent class mwthod
    */
}
