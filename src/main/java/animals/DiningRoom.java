package animals;

public class DiningRoom {
    public int food;

    public int deliveryFood(int delivery) {
        return food += delivery;
    }

    public boolean eat(Animal animal) {
        if (animal.notHungry) {
            String hunger = " не голоден!";
            if (!animal.isMale) { hunger = " не голодна!"; }
            System.out.println(animal.name + hunger);
            return true;
        } else if (food < animal.hungry) {
            System.out.println(animal.name + " не хватило корма =,( Надо увеличить доставку!");
            return false;
        } else {
            food -= animal.hungry;
            String eating = " съел ";
            if (!animal.isMale) eating = " съела ";
            System.out.println(animal.name + eating + animal.hungry + " грамм корма.");
            animal.hungry = 0;
            return animal.notHungry = true;
        }
    }
}
