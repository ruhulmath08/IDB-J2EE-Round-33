package typeConversionsPromotionsandCastings;

class A {
    final public int calculate(int a, int b) {
        return 1;
    }
}

class B extends A {
    public int calculate(int a, int b) {
        return 2;
    }
}

public class Question8 {
    public static void main(String args[]) {
        B object = new B();
        System.out.print("b is " + b.calculate(0, 1));
    }

}
