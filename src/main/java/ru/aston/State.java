package ru.aston;

public class State {
    private Person[] allState = new Person[0];

    public void addNewPerson(Person newPerson) {
        Person[] tmp = new Person[allState.length + 1];
        for (int i = 0; i < allState.length; i++) {
            tmp[i] = allState[i];
        }
        tmp[tmp.length - 1] = newPerson;
        allState = tmp;
    }

    // поиск и удаление из штата по номеру телефона
    public void removeByPhone(int phone) {
        Person worker = getOne(phone);
        if (worker == null) {
            throw new NotFoundExeption(phone);
        }
        Person[] tmp = new Person[allState.length - 1];
        int copyToIndex = 0;
        for (Person person : allState) {
            if (person.getPhone() != phone) {
                tmp[copyToIndex] = person;
                copyToIndex++;
            }
        }
        allState = tmp;
    }

    public Person[] getState() {
        return allState;
    }

    public Person getOne(int phone) {
        for (Person person : allState) {
            if (person.getPhone() == phone) return person;
        }
        return null;
    }
}
