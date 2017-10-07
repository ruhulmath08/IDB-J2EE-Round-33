package nestedClass;

public class OuterClass {
    public int x = 5;
    
    class InnerClass{
        public int x = 1;
        void methodInnerClass(int x){
            System.out.println("local x = "+x);
            System.out.println("Current class  x = "+this.x);
            System.out.println("Outer Class x = "+OuterClass.this.x);
        }
    }
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.methodInnerClass(10);
    }
}
