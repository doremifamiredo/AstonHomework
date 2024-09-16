package ru.aston.lesson11;

import com.github.javafaker.Faker;

import java.util.*;

public class PhoneDirectory {
    private final NavigableMap<String, ArrayList<String>> directory = new TreeMap<>();
    Faker faker = new Faker(new Locale("en"));

    public void add(String name, String phone) {
        if (directory.containsKey(name)) {
            directory.get(name).add(phone);
        } else {
            ArrayList<String> newPhone = new ArrayList<>();
            newPhone.add(phone);
            directory.put(name, newPhone);
        }
    }

//    public void get(String name) {
//        if (directory.containsKey(name)) {
//            String format = "|%1$-20.15s| Phone: ";
//            System.out.format(format, name);
//            System.out.println(directory.get(name));
//        } else {
//            System.out.println("Name not found");
//        }
//    }

    public String getRandom() {
        ArrayList<String> tmp = new ArrayList<String>(directory.navigableKeySet());
        int pos = new Random().nextInt(tmp.size());
        String value = (tmp.get(pos));
        return value;
    }

    public void printAll() {
        String format = "|%1$-30.18s| ";
        System.out.format(format, "Name");
        System.out.println("Phone");
        directory.entrySet().forEach(entry -> {
            System.out.format(format, entry.getKey());
            System.out.println(entry.getValue());
        });
    }

    public void generateSomePhoneNumbers(int quantity) {
        for (int i = 0; i < quantity; i++)
            add(faker.name().firstName(), faker.phoneNumber().phoneNumber());
    }

    public void addSomeAdditionaNumbers(int quantity) {
        for (int i = 0; i < 5; i++) {
            String name = getRandom();
            add(name, faker.phoneNumber().phoneNumber());
        }
    }
}

