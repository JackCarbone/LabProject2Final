package edu.canisius.csc312.project2.quotes;
import edu.canisius.csc213.project2.quotes.StockQuote;

import org.junit.Test;


import static org.junit.Assert.*;

public class StockQuoteTest {

    @Test
    public void testConstructorAndGetters() {
        // Test constructor and getters
        StockQuote instrument = new StockQuote(
            "AAPL", 
        100.0, 
        110.0, 
        90.0, 
        500, 
        95.0, 
        1618320000000L, 
        10000.0);

        assertEquals("AAPL", instrument.getSymbol());
        assertEquals(100.0, instrument.getClosePrice(), 0.001);
        assertEquals(110.0, instrument.getHighestPrice(), 0.001);
        assertEquals(90.0, instrument.getLowestPrice(), 0.001);
        assertEquals(500, instrument.getNumberOfTransactions());
        assertEquals(95.0, instrument.getOpenPrice(), 0.001);
        assertEquals(1618320000000L, instrument.getTimestamp());
        assertEquals(10000.0, instrument.getTradingVolume(), 0.001);
    }

    @Test
    public void testConstructorWithNullSymbol() {
        // Test constructor with null symbol
        StockQuote instrument = new StockQuote(null, 100.0, 110.0, 90.0, 500, 95.0, 1618320000000L, 10000.0);

        assertNull(instrument.getSymbol());
        assertEquals(100.0, instrument.getClosePrice(), 0.001);
        assertEquals(110.0, instrument.getHighestPrice(), 0.001);
        assertEquals(90.0, instrument.getLowestPrice(), 0.001);
        assertEquals(500, instrument.getNumberOfTransactions());
        assertEquals(95.0, instrument.getOpenPrice(), 0.001);
        assertEquals(1618320000000L, instrument.getTimestamp());
        assertEquals(10000.0, instrument.getTradingVolume(), 0.001);
    }

    // Add more tests as needed
}
