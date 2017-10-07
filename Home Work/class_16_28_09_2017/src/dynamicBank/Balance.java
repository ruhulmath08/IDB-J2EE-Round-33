/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicBank;

/**
 *
 * @author J2EE-33
 */
public interface Balance {
    void deposit(double amount);
    void withdrow(double amount);
    double checkBalance();
}
