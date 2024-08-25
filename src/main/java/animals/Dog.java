package animals;

public class Dog extends Animal implements Comparable<Dog> {
    public static int dogCount;

    public Dog(String breed, String name) {
        super(breed, name);
        this.hungry += 80; // собаки едят больше кошек
        dogCount++;
    }

    @Override
    public int run(int distance, Animal dog) {
        if (distance > 500) distance = 500;
        dog.distance = distance;
        String pes = "Пёс ";
        String run = " пробежал ";
        if (!dog.isMale) { pes = "Псица "; run = " пробежала "; }
        System.out.println(pes + dog.name + run + distance + " метров");
        dog.hungry += (distance / 10); // расходует калории, увеличиваем голод
        return distance;
    }

    @Override
    public int swim(int distance, Animal dog) {
        if (distance > 10) distance = 10;
        dog.distance = distance;
        String pes = "Пёс ";
        String swim = " проплыл ";
        if (!isMale) { pes = "Псица "; swim = " проплыла "; }
        System.out.println(pes + dog.name + swim + distance + " метров");
        dog.hungry += (distance / 10); // расходует калории, увеличиваем голод
        return distance;
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(o.distance, this.distance);
    }
}
