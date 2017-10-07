package localInnerClass;

public class OuterClass {
    private int data = 30;
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local local = new Local();
        local.msg();
    }
    
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
