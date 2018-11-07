package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0, odd = 0;
        int[] house = new int[15];
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.valueOf(reader.readLine());//напишите тут ваш код
            if (i % 2 == 0) {
                even = even + house[i];
            } else odd = odd + house[i];
        }
        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
