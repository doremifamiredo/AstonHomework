package ru.aston;

public class Person {
    protected String name;
    protected String job;
    protected String email;
    protected int phone;
    protected int salary;
    protected int age;

    public Person(String name, String job, String email, int phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

}
