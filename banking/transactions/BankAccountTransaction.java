package banking.transactions;

import banking.accounts.BankAccount;
import banking.exceptions.InsufficientFundsException;

public class BankAccountTransaction {
     void deposit(int money , BankAccount bankAccount){
         if(bankAccount.equals(null)){
             throw new NullPointerException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
         bankAccount.setBalance(bankAccount.getBalance()+money);
    }
     void withdraw(int money, BankAccount bankAccount ){
         bankAccount.setBalance(bankAccount.getBalance()-money);
         if(bankAccount.equals(null)){
             throw new NullPointerException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
         if(money > bankAccount.getBalance()){
            throw new InsufficientFundsException();
        }
    }
     void transfer(int money, BankAccount bankAccount1, BankAccount bankAccount2){
       bankAccount1.setBalance(bankAccount1.getBalance()-money);
       bankAccount2.setBalance(bankAccount2.getBalance()+money);
         if(bankAccount1.equals(null) | bankAccount2.equals(null)){
             throw new NullPointerException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
        if(money > bankAccount1.getBalance()){
            throw new InsufficientFundsException();
        }
    }
}
