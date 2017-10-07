package innerClass;

public class OuterClass {
    private int x = 10;
    public class InnerClass{
        private int x = 20;
        public void innerMethod(int x){
            System.out.println("local x = "+x);
            System.out.println("Current class  x = "+this.x);
            System.out.println("Outer Class x = "+OuterClass.this.x);
        }
    }
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.innerMethod(30);
    }
}
