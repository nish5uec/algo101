import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        if (sentence == null) {
            return "";
        }

        String[] parts = sentence.trim().split("\\s+");
        List<String> words = new ArrayList<>();

        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            if (i > 0) {
                result.append(' ');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "  hello   world  this   is  algo101  ";
        System.out.println(reverseWords(sentence));
    }
}
