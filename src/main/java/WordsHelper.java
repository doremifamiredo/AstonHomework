
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class WordsHelper {

    public static ArrayList<String> readFileInList(String filepath, int min) throws IOException {
        String text = Files.readString(Path.of(filepath));
        String result = text.replaceAll("\\p{Punct}|\\n|\\r", " ");
        String[] splitText = result.split(" ");
        ArrayList<String> words = new ArrayList<>();
        for (String word : splitText) {
            if (word.length() > min) {
                words.add(word.toLowerCase(Locale.ROOT));
            }
        }
        return words;
    }

    public static HashMap<String, Integer> wordСounter(ArrayList<String> words) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            String wordBase = word.substring(0, word.length() - 2);
            if (wordCount.containsKey(wordBase)) {
                int value = wordCount.get(word);
                wordCount.replace(word, value,
                        ++value);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
