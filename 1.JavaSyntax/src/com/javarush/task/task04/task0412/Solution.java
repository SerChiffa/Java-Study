package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String numberx = reader.readLine();
        int number = Integer.parseInt(numberx);
        System.out.println(tor(number));
    }

    public static int tor(int a) {
        int b = a * 2;
        int c = a + 1;

        if (a < 0) {
            return c;
        }
        if (a > 0) {
            return b;
        } else {
            return 0;
        }
    }

}