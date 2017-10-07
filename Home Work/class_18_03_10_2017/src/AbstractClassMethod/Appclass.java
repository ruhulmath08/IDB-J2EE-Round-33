package AbstractClassMethod;

public class Appclass extends AbstractClassMethod{

    @Override
    public void m1() {
        System.out.println("Override abstract m1 method");
    }

    @Override
    public void m2() {
        super.m2(); 
    }
    public static void main(String[] args) {
        Appclass appclass = new Appclass();
        appclass.m1();
        appclass.m2();
    }
}
