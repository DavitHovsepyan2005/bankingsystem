package banking;

public class BankAccountTransaction {
     void Deposit(int money , BankAccount bankAccount){
          bankAccount.Balance+= money;
    }
     void Withdraw(int money, BankAccount bankAccount ){
        bankAccount.Balance-=money;
        if(money > bankAccount.Balance){
            throw new InsufficientFundsException();
        }
    }
     void Transfer(int money, BankAccount bankAccount1, BankAccount bankAccount2){
       bankAccount1.Balance-=money;
       bankAccount2.Balance+=money;
        if(money > bankAccount1.Balance){
            throw new InsufficientFundsException();
        }
    }
}
