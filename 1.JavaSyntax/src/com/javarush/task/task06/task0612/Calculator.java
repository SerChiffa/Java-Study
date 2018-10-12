package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return (a + b);
    }

    public static int minus(int a, int b) {
        return (a - b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static double division(int a, int b) {
        double a1 = a;
        double b1 = b;
        return (a1 / b1);
    }

    public static double percent(int a, int b) {
        return (a * b * 0.01);
    }

    public static void main(String[] args) {

    }
}