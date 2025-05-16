package banking.accounts;

import banking.enums.CardStatus;
import banking.enums.CardType;
import banking.enums.Currency;
import java.time.*;
public class CardAccount  {
    long accountNumber;
    int cvv;
    LocalDate expirationDate;
    CardType cardType;
    public int ballance;
    public CardStatus cardStatus;
    Currency currency;

    public CardAccount(long accountNumber, int cvv, LocalDate expirationDate, CardType cardType, int ballance, CardStatus cardStatus, Currency currency) {
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.ballance = ballance;
        this.cardStatus = cardStatus;
        this.currency = currency;
        if (cvv >999 || cvv<100){
             throw new RuntimeException("CVV must have 3 digits");
        }

    }
}
