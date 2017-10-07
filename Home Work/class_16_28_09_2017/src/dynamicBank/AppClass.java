package dynamicBank;

public class AppClass extends Account{
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(300000.0);
        account.withdrow(600000.0);
        System.out.println("Current balance is : "+account.checkBalance());
    }
    
}
