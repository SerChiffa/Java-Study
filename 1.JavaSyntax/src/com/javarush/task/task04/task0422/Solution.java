package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String a = reader.readLine();
        String b = reader.readLine();
        int c = Integer.parseInt(b);
        if (c < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
