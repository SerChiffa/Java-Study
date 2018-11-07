package com.javarush.task.task07.task0703;

import java.util.Scanner;
/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] line = new String[10];
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            line[i] = sc.nextLine();
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = line.length;
            System.out.println(num[i]);
        }
    }
}
