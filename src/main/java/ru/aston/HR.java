package ru.aston;

public class HR {
    private State state;

    public HR(State state) {
        this.state = state;
    }

//  выводит на консоль информацию о сотруднике ПО НОМЕРУ ТЕЛЕФОНА
    public void showInfo(int phone) {
        Person worker = state.getOne(phone);
        if (worker == null) {
            throw new NotFoundExeption(phone);
        }
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: " + worker.name);
        System.out.println("Должность: " + worker.job);
        System.out.println("email: " + worker.email);
        System.out.println("Телефон: " + worker.phone);
        System.out.println("Зарплата: " + worker.salary);
        System.out.println("Возраст: " + worker.age);
    }
}
