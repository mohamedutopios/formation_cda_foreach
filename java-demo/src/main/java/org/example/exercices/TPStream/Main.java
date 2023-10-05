package org.example.exercices.TPStream;

import org.example.exercices.TPStream.model.Trader;
import org.example.exercices.TPStream.model.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader abdallah = new Trader("Abdallah","Cambridge");
        Trader audrey = new Trader("Audrey","Milan");
        Trader corentin = new Trader("Corentin","Cambridge");
        Trader tristan = new Trader("Tristan","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(abdallah,2011,400),
                new Transaction(abdallah,2012,300),
                new Transaction(audrey,2012,1000),
                new Transaction(audrey,2011,400),
                new Transaction(corentin,2012,710),
                new Transaction(corentin,2012,700),
                new Transaction(tristan,2012,950),
                new Transaction(tristan,2022,900)
        );

        // Question 1
        List<Transaction> tr2011 =  transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();

        // Question 2

        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();

        // question 2 version set

        Set<String> citiesSet = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());

        // Question 3

        List<String> traderName = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .toList();

        // Question 4

        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        // Question 5

        OptionalInt valuemax =
                transactions.stream()
                        .mapToInt(Transaction::getValue)
                        .max();

        // Question 6
        List<Trader> traders =
                transactions.stream()
                        .map(transaction -> transaction.getTrader())
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName))
                        .toList();


        // Question 7

        List<Integer> values = transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .toList();

        // Question 8

        Optional<Transaction> smalltransaction = transactions.stream().min(Comparator.comparing(Transaction::getValue));






    }



}
