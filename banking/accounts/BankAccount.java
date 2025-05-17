package banking.accounts;

import banking.enums.Currency;

public class BankAccount {
    private double accountNumber;
    private int balance;
    private Currency currency;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BankAccount(double accountNumber, Currency currency, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency=currency;
    }
}
