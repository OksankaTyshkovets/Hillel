package com.hillel.lesson5.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
                array1 [i] = sc.nextInt();
        }
        sc.close();
        printArrayOfDigit(array1);
    }
    private static void printArrayOfDigit(int[] array1){
        System.out.println(Arrays.toString(array1));
    }
}
