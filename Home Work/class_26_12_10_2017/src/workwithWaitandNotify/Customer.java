package workwithWaitandNotify;

public class Customer {
    int amount = 10000;
    synchronized  void withdraw(int amount){
        System.out.println("going to withdrow.......");
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit....");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("Withdrow complete...");
    }
    
    synchronized void deposit(int amount){
        System.err.println("going to deposit...");
        this.amount += amount;
        System.out.println("depoposit completed....");
        notify();
    }
}
