package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    private String name = "Vladislav";
    int age = 587;
    char sex = 'm';

    public void initialize (String name){
        this.name = name;
    }
    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize (String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}