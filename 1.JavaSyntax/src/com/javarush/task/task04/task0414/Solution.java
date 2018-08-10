package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String year = reader.readLine();
        int x = Integer.parseInt(year);
        if ((x % 4 == 0) && (x % 100 != 0 || (x % 400 == 0))) {

            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }

    }

}