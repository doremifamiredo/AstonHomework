package ru.aston.lesson11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Dictionary {

    public ArrayList<String> readFileInList(String filepath, int min) throws IOException {
        String text = Files.readString(Path.of(filepath));
        String result = text.replaceAll("\\p{Punct}|\\n|\\r|\u2026", " ");
        String[] splitText = result.split(" ");
        ArrayList<String> words = new ArrayList<>();
        for (String word : splitText) {
            if (word.length() >= min) {
                words.add(word.toLowerCase(Locale.ROOT));
            }
        }
        return words;
    }

    public HashMap<String, Integer> wordСounter(ArrayList<String> words) {
        HashMap<String, Integer> countWord = new HashMap<>();
        words.trimToSize();
        for (int i = 0; i < words.size(); i++) {
            String addWord = words.get(i);
            if (countWord.containsKey(addWord)) {
                        int count = countWord.get(addWord);
                        countWord.put(addWord, ++count);
            } else {
                countWord.put(addWord, 1);
            }
        }
        return countWord;
    }

    public void showResult(HashMap<String, Integer> wordCount) {
        String format = "|%1$-20.18s| ";
        System.out.format(format, "СЛОВО");
        System.out.println("СКОЛЬКО РАЗ ВСТРЕЧАЕТСЯ В ТЕКСТЕ");
        wordCount.entrySet().forEach(entry -> {
            System.out.format(format, entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
