package ru.yandex.praktikum;

public class Program {
    int age;

    public boolean isAdult(int age) {
        if (age > 0) {
            return age >= 18;
        }
        return false;
    }
}
