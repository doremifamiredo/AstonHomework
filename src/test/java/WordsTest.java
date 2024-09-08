import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class WordsTest {
    @Test
    void test() throws IOException {
        ArrayList<String> wordsList = WordsHelper.readFileInList("./txt/Text.txt", 5);
        HashMap<String, Integer> wordCount = WordsHelper.wordСounter(wordsList);
    }
}
