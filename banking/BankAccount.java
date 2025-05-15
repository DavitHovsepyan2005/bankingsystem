package banking;

public class BankAccount {
    int [] AccountNumber = new int [16];
    int Balance;
    Currency currency;

    public BankAccount(int [] accountNumber, Currency currency, int balance) {
        this.AccountNumber = accountNumber;
        this.Balance = balance;
        this.currency=currency;
    }
}
