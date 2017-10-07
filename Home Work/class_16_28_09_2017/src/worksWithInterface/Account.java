package worksWithInterface;

public class Account implements Balanced {

    public double amount;
    public double balance = 500000.0;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void wiihdrow(double amount) {
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    
}
