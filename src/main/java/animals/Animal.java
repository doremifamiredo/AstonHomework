package animals;

public class Animal {
    public String breed; // порода
    public String name;
    public boolean isMale = true; // пол животного
    public int distance = 0; // cохраняем преодолённую дистанцию для каждого животного
    protected boolean notHungry = false;
    protected int hungry = 100; //  голод > 0 = сытость
    public static int animCount;

    public Animal(String breed, String name) {
        this.breed = breed;
        this.name = name;
        if (name.endsWith("а") | name.endsWith("я")) isMale = false;
        animCount++;
    }

    public int run(int distance, Animal animal) {
        System.out.println("На старт! Внимание! Побежали!");
        return distance;
    }

    public int swim(int distance, Animal animal) {
        System.out.println("На старт! Внимание! Поплыли!");
        return distance;
    }
}
