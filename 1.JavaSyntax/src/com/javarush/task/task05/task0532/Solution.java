package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int n = 0;
        int z = 0;
        int maximum = Integer.MIN_VALUE;
        if (x > 0) {
            while (n < x) {
                z = Integer.parseInt(reader.readLine());
                maximum = maximum > z ? maximum : z;
                n++;
            }
            System.out.println(maximum);
        }
    }
}
