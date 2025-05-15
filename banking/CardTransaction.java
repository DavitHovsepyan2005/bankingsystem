package banking;

public class CardTransaction {

    void Deposit(int money, CardAccount cardAccount){
        cardAccount.Ballance+=money;
    }
    void Withdraw(int money, CardAccount cardAccount){
       cardAccount.Ballance-=money;
        if(money > cardAccount.Ballance){
            throw new InsufficientFundsException();
        }
    }

     void Transfer(int money, CardAccount cardAccount1 , CardAccount cardAccount2){
       cardAccount1.Ballance -= money;
        if(money > cardAccount1.Ballance){
            throw new InsufficientFundsException();
        }
       cardAccount2.Ballance += money;
    }
     void AddCard(CardAccount cardAccount, CardHolder cardHolder){
        cardHolder.cardAccount=cardAccount;
    }
     void BlockCard(CardAccount cardAccount){
          cardAccount.cardStatus = CardStatus.BLOCKED;
    }
}
