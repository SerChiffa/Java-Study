package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(8, 1.6));//напишите тут ваш код
        System.out.println(convertEurToUsd(9, 1.6));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur * course;//напишите тут ваш код
        return usd ;
    }
}
