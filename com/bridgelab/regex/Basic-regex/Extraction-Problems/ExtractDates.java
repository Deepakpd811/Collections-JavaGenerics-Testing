import java.util.regex.*;
import java.util.ArrayList;

public class ExtractDates {

    // Extracts all dates in dd/mm/yyyy format from the given text
    public static ArrayList<String> extractDates(String text) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {

        String[] texts = {
            "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.",
            "My birthday is on 07/11/1995.",
            "Invalid dates: 32/01/2023, 15/13/2022, 00/06/2020.",
            "Some random text without dates.",
            "Leap year dates: 29/02/2020, 29/02/2024, 29/02/1900."
        };

        // Loop through each text and extract dates
        for (String text : texts) {
            ArrayList<String> dates = extractDates(text);
            System.out.println("Text: " + text);
            if (dates.isEmpty()) {
                System.out.println("No dates found");
            } else {
                System.out.println(String.join(", ", dates));
            }
            System.out.println(); 
        }
    }
}
