package dynamicBank;

public class Account implements Balance{
    private double balance = 500000.0;
    private double amount;
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrow(double amount) {
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
    
}
