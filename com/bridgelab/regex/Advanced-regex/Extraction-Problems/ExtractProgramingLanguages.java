import java.util.regex.*;
import java.util.ArrayList;

public class ExtractProgramingLanguages {

    // return array list of programing language
    public static ArrayList<String> extractProgramingLanguages(String text) {
        String regex = "(Java|Python|C++|Javascript|Go|PHP|Python|rubby)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> programingLanguages = new ArrayList<>();
        while (matcher.find()) {
            programingLanguages.add(matcher.group());
        }
        return programingLanguages;
    }

    public static void main(String[] args) {
        String sentence = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        
        ArrayList<String> words = extractProgramingLanguages(sentence);
        System.out.println(String.join(", ", words));
    }
}
