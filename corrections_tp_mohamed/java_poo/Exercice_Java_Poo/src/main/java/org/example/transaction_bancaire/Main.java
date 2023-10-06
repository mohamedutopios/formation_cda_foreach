package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {
    static Scanner sc = new Scanner(System.in);

    static List<Account> accounts = new ArrayList<>();
    static Account selectedAccount;
    static Account receivingAccount;

    static Account.Transaction selectedTransaction;

    public static void main(String[] args) {

        Account compte1 = new Account(500);
        Account compte2 = new Account(1000);
        Account compte3 = new Account(1200);

        accounts.add(compte1);
        accounts.add(compte2);
        accounts.add(compte3);

        choice();
    }

    public static void choice()
    {
        System.out.println("Quelle opération souhaitez-vous effectuer ?");
        String[] propositions = {"1- Envoyer de l'argent", "2- Voir les différentes transactions", "3- Annuler une transaction", "0- Quitter"};

        for (String prop : propositions) {
            System.out.println(prop);
        }

         int answer = parseInt(sc.next());

        switch (answer)
        {
            case 1 -> {
                sendMoney();
                choice();
            }
            case 2 -> {
                seeTransaction();
                choice();
            }
            case 3 -> {
                deleteTransaction();
                choice();
            }
            case 0 -> {
                break;
            }
            default -> {
                System.out.println("Je n'ai pas compris votre demande ");
                choice();
            }
        }
    }

    public static void sendMoney()
    {
        showAccountAndSelect();

        System.out.println("Vers quel compte souhaitez-vous envoyer de l'argent? Indiquez le numéro ");
        int id = sc.nextInt();

        for (Account a: accounts) {
            if(Objects.equals(a.getId(), id))
                receivingAccount = a;
        }

        System.out.println("Quel montant souhaitez-vous envoyer? ");
        double montant = sc.nextDouble();

        selectedAccount.sendMoneyToAccount(receivingAccount, montant);
        receivingAccount.receiveMoney(selectedAccount, montant);
        System.out.println("Transaction effectuée");
    }

    public static void showAccountAndSelect()
    {
        for (Account a: accounts) {
            System.out.println(a);
        };

        System.out.println("Depuis quel compte souhaitez-vous effectuer l'opération ? Indiquez moi le numéro");
        int id = sc.nextInt();

        for (Account a: accounts) {
            if(Objects.equals(a.getId(), id))
                selectedAccount = a;
        }
    }
    public static void seeTransaction()
    {
        showAccountAndSelect();

        for(Account.Transaction t : selectedAccount.getTransactions())
        {
            System.out.println(t);
        }
    }

    public static void deleteTransaction()
    {
        seeTransaction();

        System.out.println("Quelle transaction souhaitez-vous annuler ?");

        int id = sc.nextInt();

        for (Account.Transaction t: selectedAccount.getTransactions()) {
            if(Objects.equals(t.getId(), id))
                selectedTransaction = t;
        }

        selectedAccount.removeMoney(selectedTransaction);
    }
}