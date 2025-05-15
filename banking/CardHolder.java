package banking;

public class CardHolder {
     int PassportNumber;
     String FullName;
    Address address;
    BankAccount bankAccount;
    CardAccount cardAccount;

    public CardHolder(int PassportNumber, String FullName , Address address, CardAccount cardAccount, BankAccount bankAccount){
        this.PassportNumber=PassportNumber;
        this.FullName=FullName;
        this.address=address;
        this.cardAccount=cardAccount;
        this.bankAccount=bankAccount;
    }
}
