package exceptionHandling;

public class TestThrows {
    public static void main(String[] args) {
        TestThrows tt = new TestThrows();
        
        try {
            for (int i = 0; i < 10; i++) {
                tt.getSomthing();
                System.out.println("Value of i : "+i);
            }
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void getSomthing()throws InterruptedException{
        Thread.sleep(1000);
    }
}
