package animals;

public class AnimalHouse {
    public Cat[] catHouse = new Cat[0];
    public Dog[] dogHouse = new Dog[0];

    public void addAnimal(Cat newCat) {
        Cat[] tmp = new Cat[catHouse.length + 1];
        for (int i = 0; i < catHouse.length; i++) {
            tmp[i] = catHouse[i];
        }
        tmp[tmp.length - 1] = newCat;
        catHouse = tmp;
    }

    public void addAnimal(Dog newDog) {
        Dog[] tmp = new Dog[dogHouse.length + 1];
        for (int i = 0; i < dogHouse.length; i++) {
            tmp[i] = dogHouse[i];
        }
        tmp[tmp.length - 1] = newDog;
        dogHouse = tmp;
    }

    public Cat[] getCatHouse() {
        return catHouse;
    }

    public Dog[] getDogHouse() {
        return dogHouse;
    }

    public Animal[] getAllAnimals() {
        int cats = catHouse.length;
        int dogs = dogHouse.length;
        Animal[] allAnimals = new Animal[cats + dogs];
        for (int i = 0; i < cats; i++) allAnimals[i] = catHouse[i];
        int dogIndex = 0;
        for (int i = cats; i < dogs + cats; i++) {
            allAnimals[i] = dogHouse[dogIndex];
            dogIndex++;
        }
        return allAnimals;
    }
}
