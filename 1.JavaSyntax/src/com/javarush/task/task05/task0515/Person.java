package com.javarush.task.task05.task0515;

/* 
Инициализация объектов
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, char sex, int money, int weight, double size) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.money = money;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
