package com.java.training.day3.streams;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class TradingApplicationTest {

    TradingApplication service = new TradingApplication();

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");
    List<Transaction> transactions = asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /**
     * Find all transactions in the year 2011 and sort them by value (small to high).
     */
    @Test
    public void findTransactionsFrom2011SortedTest() {
        List<Transaction> transactions = service.findTransactionsFrom2011Sorted();
        assertEquals(asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2011, 400)), transactions);
    }

    /**
     * What are all the unique cities where the traders work?
     */
    @Test
    public void findUniqueCitiesOfTradersTest() {
        List<String> citiesOfTraders = service.findUniqueCitiesOfTraders();
        assertEquals(asList("Cambridge", "Milan"), citiesOfTraders);
    }
}
