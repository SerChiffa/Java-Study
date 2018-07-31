package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg Wowan = new Zerg();
        Wowan.name = "Wowan";
        Zerg Oleg = new Zerg();//напишите тут ваш код
        Oleg.name = "Oleg";
        Zerg Igor = new Zerg();
        Igor.name = "Igor";
        Zerg Danil = new Zerg();
        Danil.name = "Danil";
        Zerg Wasya = new Zerg();
        Wasya.name = "Wasya";
        Protoss Olga = new Protoss();
        Olga.name = "Olga";
        Protoss Nata = new Protoss();
        Nata.name = "Nata";
        Protoss Tanya = new Protoss();
        Tanya.name = "Tanya";
        Terran Artyem = new Terran();
        Artyem.name = "Artyem";
        Terran Vitalya = new Terran();
        Vitalya.name = "Vitalya";
        Terran Iisus = new Terran();
        Iisus.name = "Iisus";
        Terran God = new Terran();
        God.name = "God";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
