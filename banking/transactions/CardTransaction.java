package banking.transactions;

import banking.accounts.CardAccount;
import banking.users.CardHolder;
import banking.exceptions.InsufficientFundsException;
import banking.enums.CardStatus;

public class CardTransaction {

    void deposit(int money, CardAccount cardAccount){
        if(cardAccount.equals(null)){
            throw new NullPointerException();
        }
        if(cardAccount.cardStatus==CardStatus.BLOCKED){
            throw new UnsupportedOperationException();
        }
        if(money<0){
            throw new IllegalArgumentException();
        }
        if(cardAccount.cardStatus==CardStatus.CLOSED){
            throw new UnsupportedOperationException();
        }
        cardAccount.ballance+=money;
    }
    void withdraw(int money, CardAccount cardAccount){
        if(cardAccount.equals(null)){
            throw new NullPointerException();
        }
        if(cardAccount.cardStatus==CardStatus.BLOCKED){
            throw new UnsupportedOperationException();
        }
        if(money<0){
            throw new IllegalArgumentException();
        }
        if(cardAccount.cardStatus==CardStatus.CLOSED){
            throw new UnsupportedOperationException();
        }

        if(money > cardAccount.ballance){
            throw new InsufficientFundsException();
        }
        cardAccount.ballance-=money;
    }

     void transfer(int money, CardAccount cardAccount1 , CardAccount cardAccount2){
       cardAccount1.ballance -= money;
         if(cardAccount1.equals(null) | cardAccount2.equals(null)){
             throw new NullPointerException();
         }
         if(cardAccount1.cardStatus==CardStatus.BLOCKED | cardAccount2.cardStatus==CardStatus.BLOCKED){
             throw new UnsupportedOperationException();
         }
         if(money<0){
             throw new IllegalArgumentException();
         }
         if(cardAccount1.cardStatus==CardStatus.CLOSED | cardAccount2.cardStatus==CardStatus.CLOSED){
             throw new UnsupportedOperationException();
         }
         if(money > cardAccount1.ballance){
            throw new InsufficientFundsException();
        }
       cardAccount2.ballance += money;
    }
     void addCard(CardAccount cardAccount, CardHolder cardHolder){
         if(cardAccount.equals(null)){
             throw new NullPointerException();
         }
         if(cardHolder.equals(null)){
             throw new NullPointerException();
         }
        cardHolder.cardAccount=cardAccount;
    }
     void blockCard(CardAccount cardAccount){
         if(cardAccount==null){
             throw new NullPointerException();
         }
          cardAccount.cardStatus = CardStatus.BLOCKED;
    }
}
