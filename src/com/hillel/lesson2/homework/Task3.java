package com.hillel.lesson2.homework;

public class Task3 {
    public static void main(String[] args) {
        int a;
        short b = 12;
        long c = 76543;

        float n;
        double m;
        float l = 43.6f;

        a = b;
        m = c;
        c = a;
        n = a;

        String sum = String.valueOf(a + b + c + n + m + l);

        System.out.println(sum);
    }
}
