import java.util.*;

public class PhoneDirectory {
    private final NavigableMap<String, ArrayList<String>> directory = new TreeMap<>();

    public void add(String name, String phone) {
        if (directory.containsKey(name)) {
            directory.get(name).add(phone);
        } else {
            ArrayList<String> newPhone = new ArrayList<>();
            newPhone.add(phone);
            directory.put(name, newPhone);
        }
    }

    public void get(String name) {
        if (directory.containsKey(name)) {
            String format = "|%1$-20.18s| контактный телефон(ы): ";
            System.out.format(format, name);
            System.out.println(directory.get(name));
        } else {
            System.out.println("Имя не найдено");
        }
    }

    public String getRandom() {
        ArrayList<String> tmp = new ArrayList<String>(directory.navigableKeySet());
        int pos = new Random().nextInt(tmp.size());
        String value = (tmp.get(pos));
        return value;
    }

    public void printAll() {
        String format = "|%1$-20.18s| ";
        System.out.format(format, "ИМЯ");
        System.out.println("ТЕЛЕФОН");
        directory.entrySet().forEach(entry -> {
            System.out.format(format, entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
