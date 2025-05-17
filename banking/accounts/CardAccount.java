package banking.accounts;

import banking.enums.CardStatus;
import banking.enums.CardType;
import banking.enums.Currency;
import java.time.*;
public class CardAccount  {
    private double accountNumber;
    private int cvv;
    private LocalDate expirationDate;
    private CardType cardType;
    private int ballance;
    private CardStatus cardStatus;
    private Currency currency;


    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public int getBallance() {
        return ballance;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CardAccount(double accountNumber, int cvv, LocalDate expirationDate, CardType cardType, int ballance, CardStatus cardStatus, Currency currency) {
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
