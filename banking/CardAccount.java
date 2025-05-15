package banking;

public class CardAccount  {
    int [] AccountNumber= new int[16];
     int Cvv;
     String ExpirationDate;
    CardType cardType;
     int Ballance;
    CardStatus cardStatus;

    Currency currency;

    public CardAccount(int [] accountNumber, int cvv, String expirationDate, CardType cardType, int ballance, CardStatus cardStatus, Currency currency) {
        this.AccountNumber = accountNumber;
        this.Cvv = cvv;
        this.ExpirationDate = expirationDate;
        this.cardType = cardType;
        this.Ballance = ballance;
        this.cardStatus = cardStatus;
        this.currency = currency;
        if (cvv >999 || cvv<100){
             throw new RuntimeException("CVV must have 3 digits");
        }

    }
}
