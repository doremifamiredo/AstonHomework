import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import animals.*;
import animals.Animal;

class AnimalsTest {

    Faker faker = new Faker(new Locale("ru"));

    Cat siamese = new Cat("Сиамский", faker.name().firstName());
    Cat peterbald = new Cat("Питерболд", faker.name().firstName());
    Cat munchkin = new Cat("Манчкин", faker.name().firstName());
    Cat maineCoon = new Cat("Мейн-кун", faker.name().firstName());
    Cat sphynx = new Cat("Сфинкс", faker.name().firstName());
    Dog dachshund = new Dog("Такса", faker.name().firstName());
    Dog jackRussell = new Dog("Джек-рассел", faker.name().firstName());
    Dog spaniel = new Dog("Спаниель", faker.name().firstName());
    Dog poodel = new Dog("Пудель", faker.name().firstName());
    Dog shepherd = new Dog("Овчарка", faker.name().firstName());

    @Test
    public void test() {
        AnimalHouse house = new AnimalHouse();
        house.addAnimal(siamese);
        house.addAnimal(peterbald);
        house.addAnimal(munchkin);
        house.addAnimal(maineCoon);
        house.addAnimal(sphynx);
        house.addAnimal(dachshund);
        house.addAnimal(jackRussell);
        house.addAnimal(spaniel);
        house.addAnimal(poodel);
        house.addAnimal(shepherd);
        // забег
        System.out.println("========ЗАБЕГ========");
        System.out.println("(участвуют кошки и собаки)");
        for (Animal animal : house.getAllAnimals()) {
            animal.run(new Random().nextInt(500), animal);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Турнирная таблица по БЕГУ: ");
        String run;
        System.out.println("КОШКИ===============");
        Arrays.sort(house.getCatHouse());
        for (int i = 0; i < house.getCatHouse().length; i++) {
            Animal animal = house.getCatHouse()[i];
            System.out.println("        " + (i + 1) + " МЕСТО");
            System.out.println(animal.name.toUpperCase());
            if (animal.isMale) run = "пробежал  "; else run = "пробежала ";
            System.out.println(run + animal.distance + " метров");
            System.out.println("порода:   " + animal.breed);
            System.out.println("====================");
        }
        System.out.println("СОБАКИ==============");
        Arrays.sort(house.getDogHouse());
        for (int i = 0; i < house.getDogHouse().length; i++) {
            Animal animal = house.getDogHouse()[i];
            System.out.println("        " + (i + 1) + " МЕСТО");
            System.out.println(animal.name.toUpperCase());
            if (animal.isMale) run = "пробежал  "; else run = "пробежала ";
            System.out.println(run + animal.distance + " метров");
            System.out.println("порода:   " + animal.breed);
            System.out.println("====================");
        }
        // заплыв
        System.out.println("========ЗАПЛЫВ=======");
        System.out.println("(участвуют только собаки)");
        for (Dog dog : house.getDogHouse()) {
            dog.swim(new Random().nextInt(10), dog);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Турнирная таблица по ПЛАВАНИЮ: ");
        String swim;
        System.out.println("СОБАКИ==============");
        Arrays.sort(house.getDogHouse());
        for (int i = 0; i < house.getDogHouse().length; i++) {
            Animal animal = house.getDogHouse()[i];
            System.out.println("        " + (i + 1) + " МЕСТО");
            System.out.println(animal.name.toUpperCase());
            if (animal.isMale) swim = "проплыл   "; else swim = "проплыла  ";
            System.out.println(swim + animal.distance + " метров");
            System.out.println("порода:   " + animal.breed);
            System.out.println("====================");
        }
        System.out.println("После соревнований пришло время обеда!");
        DiningRoom diningRoom = new DiningRoom();
        System.out.println("Привезли " + diningRoom.deliveryFood(new Random().nextInt(3000)) + " грамм корма");
        for (Animal animal : house.getAllAnimals()) {
            diningRoom.eat(animal);
        }
        System.out.println("В миске осталось " + diningRoom.food + " грамм корма.");
        String going = " пришёл ";
        if (!dachshund.isMale) { going = " пришла "; }
        System.out.println("Хитрая такса " + dachshund.name + going + "к миске снова...");
        diningRoom.eat(dachshund);
    }
}