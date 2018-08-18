package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat catUmka = new Cat("Umka", 12, 5, 8);
        Cat catSnezhok = new Cat("Snezhok", 10, 5, 12);
        Cat catAlisa = new Cat("Alisa", 15, 6, 15);
        System.out.println(catUmka.fight(catSnezhok));
        System.out.println(catUmka.fight(catAlisa));
        System.out.println(catAlisa.fight(catSnezhok));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
