import com.github.javafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Test {

   static Faker faker = new Faker();

    @org.junit.jupiter.api.Test
    void testWord() throws IOException {
        ArrayList<String> wordsList = Dictionary.readFileInList("./txt/Text.txt", 3);
        HashMap<String, Integer> wordCount = Dictionary.wordСounter(wordsList);
        String format = "|%1$-20.18s| ";
        System.out.format(format, "СЛОВО");
        System.out.println("СКОЛЬКО РАЗ ВСТРЕЧАЕТСЯ В ТЕКСТЕ");
        wordCount.entrySet().forEach(entry -> {
            System.out.format(format, entry.getKey());
            System.out.println(entry.getValue());
        });
    }

    @org.junit.jupiter.api.Test
    void testPhone() {
        Faker faker = new Faker(new Locale ("ru"));
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        for (int i = 0; i < 10; i++) {
            phoneDirectory.add(faker.name().firstName(), faker.phoneNumber().phoneNumber());
        }
        // поиск несуществующего имени
        phoneDirectory.get("Ivan");
        // добавляем вторые номера к существующим
        for (int i = 0; i < 5; i++) {
            String name = phoneDirectory.getRandom();
            phoneDirectory.add(name, faker.phoneNumber().phoneNumber());
        }
        phoneDirectory.printAll();
    }
}
