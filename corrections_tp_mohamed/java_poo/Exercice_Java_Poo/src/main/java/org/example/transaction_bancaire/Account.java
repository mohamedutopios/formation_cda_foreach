package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountMethods{

    private static int count = 0;
    double solde;
    private int id;

    List<Transaction> transactions = new ArrayList<>();

    public Account(double solde) {
        this.id = ++count;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        if(this.solde >= moneyAmount)
        {
            Transaction transaction = new Transaction(this, accountTo, moneyAmount);
            transaction.setOperation("send");
            this.transactions.add(transaction);
            this.solde -= moneyAmount;
        }
        else
        {
            System.out.println("Votre solde est insuffisant pour effectuer l'opération");
        }

    }

    @Override
    public void receiveMoney(Account accountFrom, double moneyAmount) {
        Transaction transaction = new Transaction(accountFrom, this, moneyAmount );
        transaction.setOperation("receive");
        this.transactions.add(transaction);
        this.solde += moneyAmount;
    }

    @Override
    public void removeMoney(Transaction transaction) {
        StandardAccountOperations operation = transaction.getOperation();

        StandardAccountOperations[] values = StandardAccountOperations.values();

        for (StandardAccountOperations s : values)
        {
            if(s.equals(operation))
            {

                switch (s)
                {
                    case MONEY_TRANSFER_SEND -> {
                        Account otherAccount = transaction.accountTo;
                        int otherTransactionId = transaction.id +1;
                        Transaction otherTransaction = null;

                        this.solde += transaction.moneyAmount;
                        otherAccount.solde -= transaction.moneyAmount;

                        for (Transaction t : otherAccount.transactions ) {
                            if(t.id == otherTransactionId)
                            {
                                otherTransaction = t;
                            }
                        }

                        otherAccount.transactions.remove(otherTransaction);
                        this.transactions.remove(transaction);
                    }
                    case MONEY_TRANSFER_RECEIVE -> {
                        Account otherAccount = transaction.accountFrom;
                        int otherTransactionId = transaction.id -1 ;
                        Transaction otherTransaction = null;

                        this.solde -= transaction.moneyAmount;
                        otherAccount.solde += transaction.moneyAmount;

                        for (Transaction t : otherAccount.transactions ) {
                            if (t.id == otherTransactionId) {
                                otherTransaction = t;
                            }
                        }

                        otherAccount.transactions.remove(otherTransaction);
                        this.transactions.remove(transaction);
                    }
                    default -> System.out.println("Je ne trouve pas l'opération");
                }
            }
        }

       this.transactions.remove(transaction);

    }

    @Override
    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "solde=" + solde +
                ", numéro de compte=" + id +
                '}';
    }

    public class Transaction{
        Account accountFrom;
        Account accountTo;
        double moneyAmount;

        private static int count = 0;

        private int id;

        StandardAccountOperations operation;

        public Transaction(Account accountFrom, Account accountTo, double moneyAmount) {
            this.id = ++count;
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
        }

        public Account getAccountFrom() {
            return accountFrom;
        }

        public void setAccountFrom(Account accountFrom) {
            this.accountFrom = accountFrom;
        }

        public Account getAccountTo() {
            return accountTo;
        }

        public void setAccountTo(Account accountTo) {
            this.accountTo = accountTo;
        }

        public double getMoneyAmount() {
            return moneyAmount;
        }

        public void setMoneyAmount(double moneyAmount) {
            this.moneyAmount = moneyAmount;
        }

        public int getId() {
            return id;
        }

        public void setOperation(String method)
        {
            switch (method)
            {
                case "send" -> this.operation = StandardAccountOperations.MONEY_TRANSFER_SEND;
                case "receive" -> this.operation = StandardAccountOperations.MONEY_TRANSFER_RECEIVE;
                case "cancel" -> this.operation = StandardAccountOperations.CANCEL_OPERATION;
            }
        }

        public StandardAccountOperations getOperation() {
            return operation;
        }


        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionNumber=" + id +
                    ", accountFrom=" + accountFrom +
                    ", accountTo=" + accountTo +
                    ", moneyAmount=" + moneyAmount +
                    ", operation=" + operation +
                    '}';
        }

    }
}
