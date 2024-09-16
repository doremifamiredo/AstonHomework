package ru.aston.lesson11;

import com.github.javafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Menu {
    void showMenu() {
        System.out.println("Select an action:\n" +
                "1 Count the words in the text\n" +
                "2 Open the phone directory\n" +
                "q to finish");
    }
    boolean isValid(int ch) {
        if (ch < '1' | ch > '2' & ch != 'q') return false;
        else return true;
    }
    void helpOn(int what) throws IOException {
        switch (what) {
            case '1':
                Dictionary dictionary = new Dictionary();
                ArrayList<String> wordsList = dictionary.readFileInList("./txt/Text.txt", 3);
                HashMap<String, Integer> wordCount = dictionary.wordСounter(wordsList);
                dictionary.showResult(wordCount);
                break;
            case '2':
                PhoneDirectory phoneDirectory = new PhoneDirectory();
                phoneDirectory.generateSomePhoneNumbers(10);
                phoneDirectory.addSomeAdditionaNumbers(5);
                phoneDirectory.printAll();
        }
    }
}
