package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String a = reader.readLine();
        String b = reader.readLine();
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        if (a1 > b1) {
            System.out.println(b1);
        }
        if (a1 < b1) {
            System.out.println(a1);
        }
        if (a1 == b1) {
            System.out.println(a1);
        }
    }
}