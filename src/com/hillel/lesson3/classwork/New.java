package com.hillel.lesson3.classwork;

public class New {
    public static void main(String[] args) {

        int result1 = method(2);
        System.out.println(result1);

        int result2 = method(2, 3);
        System.out.println(result2);

        int result3 = method(2,3,4);
        System.out.println(result3);

    }

    public static int method(int a){
        return a;
    }

    public static int method(int b, int c){
        return b + c;
    }

    public static int method(int n, int m, int l){
        return n * m * l;
    }
}
