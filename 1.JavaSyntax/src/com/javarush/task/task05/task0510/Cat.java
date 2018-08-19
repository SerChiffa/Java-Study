package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = "Snezhok";
    String address = null;
    String color = "white";
    int age = 12;
    int weight = 5;

    public void initialize(String name) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.name = null;
        this.address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
