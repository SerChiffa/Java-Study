package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[10];
        for (int i = 0; i < 8; i++) {
            line[i] = reader.readLine();
        }
        for (int i = line.length-1; i >= 0; i--) {
            System.out.println(line[i]);
        }
    }
}