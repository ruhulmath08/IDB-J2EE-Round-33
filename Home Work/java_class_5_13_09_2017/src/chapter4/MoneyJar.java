/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author J2EE-33
 */
public class MoneyJar {
    private  String purpose;
    private double amount;
    private double surplus;
    
    int a = 10;
    String b = "10";
    
    void intVal(Object b){
        System.out.println("Result : "+b);
    }
    

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        this.surplus = surplus;
    }
    
    
}
