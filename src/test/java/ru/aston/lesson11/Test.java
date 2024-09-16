package ru.aston.lesson11;

import com.github.javafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Test {

   static Faker faker = new Faker();

    @org.junit.jupiter.api.Test
    void testWord() throws IOException {
        Dictionary dictionary = new Dictionary();
        ArrayList<String> wordsList = dictionary.readFileInList("./txt/Text.txt", 3);
        HashMap<String, Integer> wordCount = dictionary.wordСounter(wordsList);

    }

    @org.junit.jupiter.api.Test
    void testPhone() {
        Faker faker = new Faker(new Locale ("ru"));
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        for (int i = 0; i < 10; i++) {
            phoneDirectory.add(faker.name().firstName(), faker.phoneNumber().phoneNumber());
        }

        // добавляем вторые номера к существующим
        for (int i = 0; i < 10; i++) {
            String name = phoneDirectory.getRandom();
            phoneDirectory.add(name, faker.phoneNumber().phoneNumber());
        }
        phoneDirectory.printAll();
    }
}
