package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour) {
        int second = hour * 3600;
        return hour*3600;
    }//напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(5)); //напишите тут ваш код
        System.out.println(convertToSeconds(12));

    }
}
