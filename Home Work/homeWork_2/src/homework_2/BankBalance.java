package homework_2;

public class BankBalance {

    public static void main(String[] args) {
        BalanceCalculation balanceCalculation = new BalanceCalculation();        
        System.out.println("Add balance : "+balanceCalculation.AddBalance(30000.0));
        System.out.println("Add balance : "+balanceCalculation.AddBalance(3000.0));
        System.out.println("Current Balance is : "+balanceCalculation.checkBalance());
        System.out.println("Express money: "+balanceCalculation.experseMoney(6100.0));
    }
    
}
