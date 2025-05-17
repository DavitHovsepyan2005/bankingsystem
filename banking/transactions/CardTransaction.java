package banking.transactions;

import banking.accounts.CardAccount;
import banking.users.CardHolder;
import banking.exceptions.InsufficientFundsException;
import banking.enums.CardStatus;

import java.util.ArrayList;

public class CardTransaction {

    void deposit(int money, CardAccount cardAccount){
        if(cardAccount.equals(null)){
            throw new NullPointerException();
        }
        if(cardAccount.getCardStatus()==CardStatus.BLOCKED){
            throw new UnsupportedOperationException();
        }
        if(money<0){
            throw new IllegalArgumentException();
        }
        if(cardAccount.getCardStatus()==CardStatus.CLOSED){
            throw new UnsupportedOperationException();
        }
        cardAccount.setBallance(cardAccount.getBallance()+money);
    }
    void withdraw(int money, CardAccount cardAccount){
        if(cardAccount.equals(null)){
            throw new NullPointerException();
        }
        if(cardAccount.getCardStatus()==CardStatus.BLOCKED){
            throw new UnsupportedOperationException();
        }
        if(money<0){
            throw new IllegalArgumentException();
        }
        if(cardAccount.getCardStatus()==CardStatus.CLOSED){
            throw new UnsupportedOperationException();
        }

        if(money > cardAccount.getBallance()){
            throw new InsufficientFundsException();
        }
        cardAccount.setBallance(cardAccount.getBallance()-money);
    }

     void transfer(int money, CardAccount cardAccount1 , CardAccount cardAccount2){
         cardAccount1.setBallance(cardAccount1.getBallance()-money);
         cardAccount2.setBallance(cardAccount2.getBallance()+money);
         if(cardAccount1.equals(null) | cardAccount2.equals(null)){
             throw new NullPointerException();
         }
         if(cardAccount1.getCardStatus()==CardStatus.BLOCKED | cardAccount2.getCardStatus()==CardStatus.BLOCKED){
             throw new UnsupportedOperationException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
         if(cardAccount1.getCardStatus()==CardStatus.CLOSED | cardAccount2.getCardStatus()==CardStatus.CLOSED){
             throw new UnsupportedOperationException();
         }
         if(money > cardAccount1.getBallance()){
            throw new InsufficientFundsException();
        }

    }
     void addCard(ArrayList<CardAccount> cardAccount, CardHolder cardHolder){
         if(cardAccount.equals(null)){
             throw new NullPointerException();
         }
         if(cardHolder.equals(null)){
             throw new NullPointerException();
         }
         if(cardAccount.isEmpty()){
             throw new NullPointerException();
         }
         if(cardAccount.size()>3){
             throw new IllegalArgumentException();
         }
        cardHolder.setCardAccount(cardHolder.getCardAccount());
    }
     void blockCard(CardAccount cardAccount){
         if(cardAccount==null){
             throw new NullPointerException();
         }
          cardAccount.setCardStatus(CardStatus.BLOCKED);
    }
}
