/*Class: Teller
 * Methods: createAccount, deleteAccount, checkBalance, seeTransaction, Withdraw, transfer
 * Name: Nardos Mamo
 * Date: 2/23/23
 */
package edu.ithaca.dragon.datastructures.node;

import java.util.ArrayList;

public class Teller implements ATM_Teller_Interface{
    public CentralBank bank;
   //Create Account for Customer
    public void createAccount(Customer customer, int acc_num){
        Account acc = new Account(acc_num,0.0,customer);
        bank.addAccounts(acc); 
    }
//Delete Account 
    public void deleteAccount(Account account){
        bank.deleteAccount(account);
    }
//Check Balance in the account
    public double checkBalance(Account account) {
        return account.checkBalance();
    }
//Deposits the amount of money passes in the account that is passed   
    public void deposit(Account account, double amount){
        account.deposit(amount);
    }
 //returns the transaction history od the account
    public ArrayList<Double> seeTransaction(Account account){
        return account.getTransactionHistory();
    }
    //withdraws the amount of money passed   
    public void withdraw(Account account,double amount){
        account.withdraw(amount);
    }
//transfers money from one account to another
    public void transfer(Account accountSender, Account accountReciever, double amount){
        accountSender.transfer(accountReciever, amount);
    }
    @Override
    public boolean checkCredentials(String credentials) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkCredentials'");
    }
}