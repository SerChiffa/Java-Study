package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        String d1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);
        if (a >= b && a >= c && a >= d) {
            System.out.println(a);
        }
        else if (a <= b && b >= c && b >= d) {
            System.out.println(b);
        }
        else if (a <= c && b <= c && c >= d) {
            System.out.println(c);
        }
        else if (a <= d && b <= d && c <= d) {
            System.out.println(d);
        }
    }
}
