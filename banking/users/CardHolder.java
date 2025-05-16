package banking.users;

import banking.accounts.Address;
import banking.accounts.BankAccount;
import banking.accounts.CardAccount;

public class CardHolder {
    int passportNumber;
    String fullName;
    Address address;
   public BankAccount bankAccount;
   public CardAccount cardAccount;

    public CardHolder(int PassportNumber, String FullName , Address address, CardAccount cardAccount, BankAccount bankAccount){
        this.passportNumber=PassportNumber;
        this.fullName=FullName;
        this.address=address;
        this.cardAccount=cardAccount;
        this.bankAccount=bankAccount;
    }
}
