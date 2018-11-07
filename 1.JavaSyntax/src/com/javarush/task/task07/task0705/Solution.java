package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num1 = new int[20];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = Integer.parseInt(reader.readLine());
        }
        int[] num2 = new int[10];
        System.arraycopy(num1, 0, num2, 0, 10);

        int[] num3 = new int[10];
        System.arraycopy(num1, 10, num3, 0, 10);
        for (int i = 0; i < num3.length; i++) {
            System.out.println(num3[i]);
        }
    }
}
