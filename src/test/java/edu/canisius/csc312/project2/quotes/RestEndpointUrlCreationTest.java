package edu.canisius.csc312.project2.quotes;

import org.junit.Test;

import edu.canisius.csc213.project2.quotes.PolygonStockQuoteProvider;
import edu.canisius.csc213.project2.quotes.StockQuoteProvider;

import static org.junit.Assert.*;

public class RestEndpointUrlCreationTest {

    private final String apiKey = "your-api-key";
    private StockQuoteProvider sqp = new PolygonStockQuoteProvider();

    @Test
    public void testGetEndpointUrl() {
        String symbolName = "AAPL";
        String date = "2022-04-11";


        
        String expected = "https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/day/2022-04-11/2022-04-11?apiKey=" + apiKey;
        assertEquals(expected, sqp.getEndpointUrl(symbolName, date, apiKey));
    }

    @Test
    public void testGetEndpointUrlWithDifferentDate() {
        String symbolName = "AAPL";
        String date = "2022-04-12";
        String expected = "https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/day/2022-04-12/2022-04-12?apiKey=" + apiKey;
        assertEquals(expected, sqp.getEndpointUrl(symbolName, date, apiKey));
    
    }

    @Test
    public void testGetEndpointUrlWithDifferentSymbol() {
        String symbolName = "GOOGL";
        String date = "2022-04-11";
        String expected = "https://api.polygon.io/v2/aggs/ticker/GOOGL/range/1/day/2022-04-11/2022-04-11?apiKey=" + apiKey;
        assertEquals(expected, sqp.getEndpointUrl(symbolName, date, apiKey));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndpointUrlWithInvalidDateFormat() {
        String symbolName = "AAPL";
        String date = "11-04-2022"; // Invalid date format
        sqp.getEndpointUrl(symbolName, date, apiKey); // This should throw an IllegalArgumentException
    }

    // Add more tests as needed
}
