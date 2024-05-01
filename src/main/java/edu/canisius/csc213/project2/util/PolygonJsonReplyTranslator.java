package edu.canisius.csc213.project2.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.canisius.csc213.project2.quotes.*;

import java.io.IOException;

public class PolygonJsonReplyTranslator {

    public StockQuote translateJsonToFinancialInstrument(String json) throws IOException {
        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        // Read JSON string into JsonNode
        JsonNode rootNode = objectMapper.readTree(json);
        
        // Extract relevant fields from JSON and create StockQuote object
        String symbol = rootNode.path("ticker").asText();
        JsonNode resultsNode = rootNode.path("results").get(0); // Get the first object in the "results" array
        double closePrice = resultsNode.path("c").asDouble(); // Extract the close price
        double highestPrice = resultsNode.path("h").asDouble();
        double lowestPrice = resultsNode.path("l").asDouble();
        int numberOfTransactions = resultsNode.path("n").asInt();
        double openPrice = resultsNode.path("o").asDouble();
        long timestamp = resultsNode.path("t").asLong();
        double tradingVolume = resultsNode.path("v").asDouble();
        
        // Create and return StockQuote object
        return new StockQuote(symbol, closePrice, highestPrice, lowestPrice,
                              numberOfTransactions, openPrice, timestamp, tradingVolume);
    }
}
