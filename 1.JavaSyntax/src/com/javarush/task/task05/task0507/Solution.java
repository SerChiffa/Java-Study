package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num, sum, count;
        sum = count = 0;
        while (true){
            num = Integer.parseInt(reader.readLine());
            if (num != -1){
                sum += num;
                count++;
            }
            else
                break;
        }
        System.out.println((float) sum / count);
    }
}

