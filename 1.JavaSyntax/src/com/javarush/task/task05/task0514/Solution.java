package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Hodor", 13);
    }

    static class Person {
        String name = "Alesha";
        int age = 26;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
}
