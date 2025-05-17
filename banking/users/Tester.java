package banking.users;

import banking.accounts.Address;
import banking.accounts.BankAccount;
import banking.accounts.CardAccount;
import banking.enums.CardStatus;
import banking.enums.CardType;
import banking.enums.Currency;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(11111111, Currency.AMD,1000);
        ArrayList<CardAccount> cardAccount = new ArrayList<CardAccount>();
        Address address = new Address("Armenia", "Erevan", "Moldovakan", "Erevan", "4/2");
        CardHolder cardHolder = new CardHolder(1111,"Davit Hovsepyan", address, cardAccount, bankAccount);
    }
}
