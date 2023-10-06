package org.example;

import java.util.List;

public interface AccountMethods {
    public void sendMoneyToAccount(Account accountTo, double moneyAmount);
    public void receiveMoney(Account accountFrom, double moneyAmount);
    public void removeMoney(Account.Transaction transaction);
    public List<Account.Transaction> getTransactions();
}
