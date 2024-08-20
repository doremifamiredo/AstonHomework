package ru.aston;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption(int phone) {
        super("Сотрудник с телефоном " + phone + " не найден");
    }
}
