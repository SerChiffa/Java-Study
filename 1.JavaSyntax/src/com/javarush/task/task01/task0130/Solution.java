package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //celsium = 41;//напишите тут ваш код
        double fahrenheit = (9 / 5.0 * celsium) + 32.0;
        return fahrenheit;
    }
}