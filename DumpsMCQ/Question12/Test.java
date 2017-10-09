package Question12;

public class Test {
    public static void aMethod() throws Exception{
        try {
            throw Exception();//arise exception
        }
        finally{
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        try {
            aMethod();//the method face exception catch block execute
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("finished");
    }

    private static Exception Exception() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
