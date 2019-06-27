package com.java.training.day3.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class TradingApplication {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public List<Transaction> findTransactionsFrom2011Sorted(){
        return transactions.stream()
                            .filter(transaction -> transaction.getYear() == 2011)
                            //.sorted((tr1, tr2) -> new Integer(tr1.getValue()).compareTo(tr2.getValue()))
                            .sorted(Comparator.comparing(Transaction::getValue))
                            .collect(toList());

    }

    public List<String> findUniqueCitiesOfTraders(){
        return transactions.stream()
                            .map(Transaction::getTrader)
                            .map(Trader::getCity)
                            .distinct()
                            .sorted()
                            .collect(Collectors.toList());
    }
}
