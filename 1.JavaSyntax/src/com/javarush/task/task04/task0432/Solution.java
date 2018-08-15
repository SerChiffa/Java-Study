package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        String a = reader.readLine();
        int c = Integer.parseInt(reader.readLine());
        int d = 1;
        while (c > 0) {
            System.out.println(a);
            c--;
        }

    }
}
