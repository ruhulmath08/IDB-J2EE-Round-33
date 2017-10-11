package testThreadYield;

public class CreateThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        t.sleep(5000);
        System.out.println("Thread name : "+t.getName());
    }
}
