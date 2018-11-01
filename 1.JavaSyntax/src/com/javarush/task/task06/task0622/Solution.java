package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/*
Числа по возрастанию
*/

public class Solution
{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception
    {
        int[] intArray = new int[5];

        arrFill(intArray);
        arrSort(intArray);
        arrPrint(intArray);
    }

    static void arrFill(int[] arr) throws Exception
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
    }

    static void arrPrint(int[] arr)
    {
        for (int d: arr)
        {
            System.out.println(d);
        }

    }

    static void arrSort(int[] arr)
    {
        Arrays.sort(arr);
    }


}