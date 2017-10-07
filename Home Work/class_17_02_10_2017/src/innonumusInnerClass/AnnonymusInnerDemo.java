package innonumusInnerClass;

public class AnnonymusInnerDemo {
    public static void main(String[] args) {
        B b = new B(){
            @Override
            public void displsyMsg() {
                 System.out.println("method from class A but customise");
            }
           
        };
        b.displsyMsg();
    }
}
