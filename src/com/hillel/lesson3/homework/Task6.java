package com.hillel.lesson3.homework;

public class Task6 {
    public static void main(String[] args) {
        int n = 32;
        int m = 20;

        int result;
        System.out.println(result = sum(n, m));
        System.out.println(result = subtraction(n, m));

        double resultDiv =  new Task6().division(n, m);
        System.out.println(resultDiv);

        double resultMult = new Task6().multiplication(n, m);
        System.out.println(resultMult);

    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int subtraction(int a, int b){
        return a - b;
    }

    private double division(double a, double b){
        return a / b;
    }

    private double multiplication(double a, double b){
        return a * b;
    }
}
