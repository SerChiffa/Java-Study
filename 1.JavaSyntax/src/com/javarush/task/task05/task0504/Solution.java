package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat catPushok = new Cat("Vaska", 7, 4, 12);
        Cat catSnezhok = new Cat("Vaska", 7, 4, 12);
        Cat catAlisa = new Cat("Vaska", 7, 4, 12);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}