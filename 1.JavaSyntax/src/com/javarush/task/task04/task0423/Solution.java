package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String name = reader.readLine();
        String number = reader.readLine();
        int x = Integer.parseInt(number);
        if (x > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
