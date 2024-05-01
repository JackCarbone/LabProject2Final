package edu.canisius.csc312.project2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import edu.canisius.csc213.project2.Controller;
import edu.canisius.csc213.project2.quotes.MockStockQuoteProvider;
import edu.canisius.csc213.project2.quotes.StockQuoteProvider;

public class ControllerTest {

    public static void main(String[] args) throws IOException{}

    @Test
    public void testController() throws IOException {
        // Mock objects
        StockQuoteProvider mockSqp = new MockStockQuoteProvider();
        // Create controller instance
        Controller controller = new Controller(mockSqp, "AAPL", "MOCK_API_KEY");
        // Call the prettyPrint method to obtain the formatted string
        String expected = "Symbol: AAPL\n" +
                          "Close Price: 150.0\n" +
                          "Highest Price: 160.0\n" +
                          "Lowest Price: 140.0\n" +
                          "Number of Transactions: 1000\n" +
                          "Open Price: 155.0\n" +
                          "Trading Volume: 50000.0\n";
        
        String actual = controller.getStockQuote().prettyPrint();

        // Compare the expected string with the actual string
        assertEquals(expected, actual);
    }
}
