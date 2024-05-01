package edu.canisius.csc213.project2.quotes;

import java.io.IOException;

public class MockStockQuoteProvider implements StockQuoteProvider {
    
    @Override
    public StockQuote getStockQuote(String url) throws IOException{
        // For demonstration purposes, let's create a mock FinancialInstrument object
        // In reality you would need to connect to the URL and get the JSON reply.
        // Then you would need to call the JsonToFianancialInstrumentTranslator
        return new StockQuote("AAPL", 150.0, 160.0, 140.0, 1000, 155.0, System.currentTimeMillis(), 50000);
    
    }

    @Override
    public String getEndpointUrl(String symbolName, String date, String apiKey) {
        // TODO Auto-generated method stub
        return "FAKE_URL" + symbolName + apiKey;
    }
}
