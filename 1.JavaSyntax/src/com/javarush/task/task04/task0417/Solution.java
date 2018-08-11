package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (a == b) {

            System.out.println(a + " " + b);
        }
    }
}