package banking.users;

import banking.accounts.Address;
import banking.accounts.BankAccount;
import banking.accounts.CardAccount;
import banking.enums.CardStatus;
import banking.enums.CardType;
import banking.enums.Currency;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(11111111, Currency.AMD,1000);
        CardAccount cardAccount = new CardAccount(55555555,456, LocalDate.of(2025,02,22), CardType.VISA, 1000, CardStatus.ACTIVE, Currency.AMD );
        Address address = new Address("Armenia", "Erevan", "Moldovakan", "Erevan", "4/2");
        CardHolder cardHolder = new CardHolder(1111,"Davit Hovsepyan", address, cardAccount, bankAccount);
    }
}
