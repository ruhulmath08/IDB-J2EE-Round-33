package Question21;

public class Test {

    public static void main(String[] args) {
        boolean bool = true;
        if (bool = false) {
            System.out.println("a");
        } else if (bool) {
            System.out.println("c");
        } else if (!bool) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }
    }
}
