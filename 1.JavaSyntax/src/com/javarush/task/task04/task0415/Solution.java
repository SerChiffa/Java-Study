package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String one = reader.readLine();
        String two = reader.readLine();
        String thre = reader.readLine();
        int a = Integer.parseInt(one);
        int b = Integer.parseInt(two);
        int c = Integer.parseInt(thre);
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");

        }
    }
}