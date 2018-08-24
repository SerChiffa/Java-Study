package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    String address;
    String color;
    int weight;
    int age;

    public Cat(String name) {
        this.name = name;
        this.color = "Idigo";
        this.weight = 14;
        this.age = 10;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = "Black";
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.color = "White";
        this.weight = 32;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 34;
    }

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        this.age = 43;
    }

    public static void main(String[] args) {

    }
}
