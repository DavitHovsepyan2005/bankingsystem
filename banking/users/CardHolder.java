package banking.users;

import banking.accounts.Address;
import banking.accounts.BankAccount;
import banking.accounts.CardAccount;
import java.util.*;
public class CardHolder {
    private int passportNumber;
    private String fullName;
    private Address address;
    private BankAccount bankAccount;
    private ArrayList<CardAccount> cardAccount;

    public void setCardAccount(ArrayList<CardAccount> cardAccount) {
        this.cardAccount = cardAccount;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public Address getAddress() {
        return address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public ArrayList<CardAccount> getCardAccount() {
        return cardAccount;
    }

    public CardHolder(int PassportNumber, String FullName , Address address, ArrayList<CardAccount> cardAccount, BankAccount bankAccount){
        this.passportNumber=PassportNumber;
        this.fullName=FullName;
        this.address=address;
        this.cardAccount=cardAccount;
        this.bankAccount=bankAccount;
    }
}
