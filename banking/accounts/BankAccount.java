package banking.accounts;

import banking.enums.Currency;

public class BankAccount {
    private long accountNumber;
    public int balance;
    Currency currency;

    public BankAccount(long accountNumber, Currency currency, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency=currency;
    }
}
