package staticKeyword;

public class AppClass {
    static {
        System.out.println("Block before main() method");
    }
    public static void main(String[] args) {
        StaticKeyword sk = new StaticKeyword();
        System.out.println(StaticKeyword.sx);
    }
    
    static {
        System.out.println("Block after main() method");
    }
    
}
