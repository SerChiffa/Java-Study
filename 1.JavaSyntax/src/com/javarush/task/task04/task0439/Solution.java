package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String name = reader.readLine();
        for (int a = 1; a < 11; a++) {
            System.out.println(name + " любит меня.");
        }

    }
}
