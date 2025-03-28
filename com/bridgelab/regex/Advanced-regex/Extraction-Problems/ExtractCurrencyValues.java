import java.util.regex.*;
import java.util.ArrayList;

public class ExtractCurrencyValues {

    // Method to extract currency values
    public static ArrayList<String> extractCurrencyValues(String text) {
        String regex = "\\$?\\d+\\.\\d{2}";  // Matches prices with or without '$'
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> currencyValues = new ArrayList<>();

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }
        return currencyValues;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        ArrayList<String> values = extractCurrencyValues(text);
        System.out.println("Extracted Currency Values: " + String.join(", ", values));
    }
}
