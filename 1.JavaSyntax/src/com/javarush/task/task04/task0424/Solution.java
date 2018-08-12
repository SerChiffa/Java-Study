package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        if (a != b && b == c) {
            System.out.println(1);
        }
        if (a != c && a == b) {
            System.out.println(3);
        }
        if (b != c && a == c) {
            System.out.println(2);
        }
    }
}
