package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String number = reader.readLine();
        int a = Integer.parseInt(number);
        if (a < 0 && a % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (a < 0 && a % 2 == -1) {
            System.out.println("отрицательное нечетное число");
        } else if (a == 0) {
            System.out.println("ноль");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (a > 0 && a % 2 == 1) {
            System.out.println("положительное нечетное число");
        }
    }
}
