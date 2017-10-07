package worksWithInterface;

public class AppClass {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(300000.0);
        account.wiihdrow(600000.0);
        double blance = account.checkBalance();

        System.out.println("Balancealance : "+blance);
        
    }
}
