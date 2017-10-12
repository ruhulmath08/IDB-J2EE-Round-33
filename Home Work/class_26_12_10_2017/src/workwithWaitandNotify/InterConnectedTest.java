package workwithWaitandNotify;

public class InterConnectedTest {

    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.withdraw(10000);
            }
        }.start();
    }
}

