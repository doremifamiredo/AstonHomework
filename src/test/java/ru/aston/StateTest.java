package ru.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    Person worker1 = new Person("Селезнёв Пётр Сергеевич", "Водитель", "selezn@mail.com", 8928, 100_000, 48);
    Person worker2 = new Person("Коровина Анна Павловна", "Бухгалтер", "korova@mail.com", 8988, 200_000, 43);
    Person worker3 = new Person("Петухов Юррий Петрович", "Менеджер", "petuh@mail.com", 8951, 80_000, 25);
    Attraction atr1 = new Attraction("Карусель", "12-21", 500, 1);
    Attraction atr2 = new Attraction("Горки", "13-21", 400, 1);


    @Test
    public void stateTest() {
        State state = new State();
        HR HR = new HR(state);
        state.addNewPerson(worker1);
        state.addNewPerson(worker2);
        state.addNewPerson(worker3);
        HR.showInfo(8988);
        state.removeByPhone(8988);
        Person[] expected = {worker1, worker3};
        assertArrayEquals(expected, state.getState());
    }

    @Test
    public void parkTest() {
        Park cosmoPark = new Park();

        cosmoPark.addNewAtr(atr1);
        cosmoPark.addNewAtr(atr2);
        cosmoPark.showInfo(1);

        Attraction[] expected = {atr1};
        assertArrayEquals(expected, cosmoPark.getCosmoPark());

    }
}