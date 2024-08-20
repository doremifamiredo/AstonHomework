package ru.aston;

public class Main {
    public static void main(String[] args) {
        State state = new State();
        HR HR = new HR(state);
        Person worker1 = new Person("Селезнёв Пётр Сергеевич", "Водитель", "selezn@mail.com", 8928, 40_000, 48);
        Person worker2 = new Person("Коровина Анна Павловна", "Бухгалтер-кассир", "korova@mail.com", 8988, 50_000, 43);
        Person worker3 = new Person("Федоров Адам Дмитриевич", "Механик-слесарь", "fedorov@mail.com", 8917, 45_000, 25);
        Person worker4 = new Person("Наумов Александр Львович", "Оператор аттракционов", "naumov@mail.ru", 8915, 55_000, 40);
        Person worker5 = new Person("Степанов Александр Елисеевич", "HR", "stepanov@mail.ru", 8921, 65_000, 40);

        //TODO массив с сотрудниками хранится с классе State
        //добавляем сотрудников
        state.addNewPerson(worker1);
        state.addNewPerson(worker2);
        state.addNewPerson(worker3);
        state.addNewPerson(worker4);
        state.addNewPerson(worker5);

        //TODO выводит на консоль информацию о сотруднике ПО НОМЕРУ ТЕЛЕФОНА
        HR.showInfo(8915);

        Park cosmoPark = new Park();
        Attraction atr1 = new Attraction("Карусель", "12-21", 500, 1);
        Attraction atr2 = new Attraction("Горки", "13-21", 400, 2);
        cosmoPark.addNewAtr(atr1);
        cosmoPark.addNewAtr(atr2);

        // выводит информацию об аттракционе по его ID
        cosmoPark.showInfo(1);
    }
}