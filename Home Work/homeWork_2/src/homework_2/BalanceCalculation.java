
package homework_2;

public class BalanceCalculation {
    private double balance;
    private double income;
    public double experse;

    public BalanceCalculation() {
    }
    
    public double checkBalance(){
        this.balance = balance;
        return balance;
    }
    
    public double AddBalance(double income){
        this.balance += income; 
           return income;
    }
    
    public Object experseMoney(double experse){
        //this.experse = experse;
        if((this.balance - experse) >= 0){
            this.balance = this.balance - experse;
            return "Express : "+experse+" balance is : "+this.balance;
        }
        else{
            return "Insufficent balance";
        }
         
    }
}
