package banking;

public class Tester {
    public static void main(String[] args) {
        int [] cardnumber = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        BankAccount bankAccount = new BankAccount(cardnumber,Currency.AMD,1000);
        CardAccount cardAccount = new CardAccount(cardnumber,456,"10/28", CardType.VISA, 1000, CardStatus.ACTIVE, Currency.AMD );
        Address address = new Address("Armenia", "Erevan", "Moldovakan", "Erevan", "4/2");
        CardHolder cardHolder = new CardHolder(1111,"Davit Hovsepyan", address, cardAccount, bankAccount);
    }
}
