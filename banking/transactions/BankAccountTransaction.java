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
         bankAccount.balance+= money;
    }
     void withdraw(int money, BankAccount bankAccount ){
        bankAccount.balance-=money;
         if(bankAccount.equals(null)){
             throw new NullPointerException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
         if(money > bankAccount.balance){
            throw new InsufficientFundsException();
        }
    }
     void transfer(int money, BankAccount bankAccount1, BankAccount bankAccount2){
       bankAccount1.balance-=money;
       bankAccount2.balance+=money;
         if(bankAccount1.equals(null) | bankAccount2.equals(null)){
             throw new NullPointerException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
        if(money > bankAccount1.balance){
            throw new InsufficientFundsException();
        }
    }
}
