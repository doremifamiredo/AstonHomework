package animals;

public class Cat extends Animal  implements Comparable<Cat> {
    public static int catCount;

    public Cat(String breed, String name) {
        super(breed, name);
        catCount++;
    }


    @Override
    public int run(int distance, Animal cat) {
        if (distance > 200) distance = 200;
        cat.distance = distance;
        String kot = "Кот ";
        String run = " пробежал ";
        if (!cat.isMale) { kot = "Кошка "; run = " пробежала "; }
        System.out.println(kot + cat.name + run + distance + " метров");
        cat.hungry += (distance / 10); // расходует калории во время бега, увеличиваем голод
       return distance;
    }

    @Override
    public int swim(int distance, Animal animal) {
        System.out.println("КОТЫ НЕ УМЕЮТ ПЛАВАТЬ!");
        return distance;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(o.distance, this.distance);
    }
}
