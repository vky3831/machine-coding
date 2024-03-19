package nasdaqInterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Input: A csv file containing a list of trades coming from the exchange / broker. It has the stock where the trade happened and the price. This file can be extremely large (millions and millions of rows).
 * Sample input:
 * BHP, 100.00
 * BHP, 102.00
 * AMP, 20.00
 * BHP, 101.00
 * CBA, 40.00
 * CBA, 41.00
 * BHP, 101.50
 * AMP, 21.00
 *
 * Now we are tasked with writing a report summarizing the trade data. Write a report generator that prints the min and max of each of the instruments to an output file.
 * Sample output:
 * BHP, 100.00, 102.00
 * AMP, 20.00, 21.00
 * CBA, 30.00, 41.00
 */
public class QuestionOne {
    public static void main(String[] args) throws IOException {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/nasdaq/input.csv"));
        String line;
        while ((line = br.readLine()) != null){
            String[] values = line.split(",");
            records.add(Arrays.asList(values));
        }
        Map<String, List<Double>> priceList =  new HashMap<>();
        for(List<String> row: records){
            String name = row.get(0);
            double price = Double.parseDouble(row.get(1));
            List<Double> prices = priceList.getOrDefault(name, new ArrayList<>());
            prices.add(price);
            priceList.put(name, prices);
        }

        List<String> output = new ArrayList<>();
        for(Map.Entry<String, List<Double>> entry : priceList.entrySet()){
            String name = entry.getKey();
            List<Double> prices = entry.getValue();
            Collections.sort(prices);
            output.add(name + " , " + prices.get(0) + " , " + prices.get(prices.size()-1));
        }

        for(String out : output){
            System.out.println(out);
        }
    }
}
