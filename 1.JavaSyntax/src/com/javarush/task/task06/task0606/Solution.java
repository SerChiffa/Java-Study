package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int sum = 0;
        int a = 0;
        int b = 0;
        while(x > 0) {
            sum += x % 10;
            if (x % 2 == 0)
                a++;
            else if (x % 2 != 0)
                b++;
            x /= 10;
        }
        odd = b;
        even = a;
        System.out.print("Even: " + even + " Odd: " + odd);

    }
}
