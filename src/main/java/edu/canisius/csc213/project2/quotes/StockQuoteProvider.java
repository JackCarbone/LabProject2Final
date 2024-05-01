package edu.canisius.csc213.project2.quotes;

import java.io.IOException;

public interface StockQuoteProvider {
    /*
     * The method is expected to return a well formed URL to contact a quote provider.
     * For example, if you provided:
     * 
     * symbol - AAPL
     * date   - 2023-01-09
     * key    - yourKey
     * 
     * It would reply with: 
     * https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/day/2023-01-09/2023-01-09?apiKey=yourKey
     */
    public String getEndpointUrl(String symbolName, String date, String apiKey);
  
    /*
     * This takes a well formed endpoint URL (what is returned by getEndpointUrl)
     * and then returns a StockQuote object.
     */
    public StockQuote getStockQuote(String endpointUrl) throws IOException;
}
