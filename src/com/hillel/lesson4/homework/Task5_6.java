package com.hillel.lesson4.homework;

public class Task5_6 {
    public static void main(String[] args) {
        System.out.println("Max value is ");
        maxValue();
        System.out.println("Min value is ");
        minValue();
    }

    private static void maxValue() {
        int max = 0;
        int i;
        int[] array = {32, 7, 54, -98, 2, -987, 765, 23, 566, -9};
        if (array[1] > array[0]) {
            max = array[1];
        }else {
            max = array[0];
        }
        for (i = 2; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }else {
                max = max;
            }

        } System.out.println(max);
    }

    private static void minValue() {
        int min = 0;
        int i;
        int[] array = {32, 7, 54, -98, 2, -987, 765, 23, 566, -9};
        if (array[1] > array[0]) {
            min = array[0];
        }else {
            min = array[1];
        }
        for (i = 2; i < array.length; i++){
            if (array[i] > min) {
                min = min;
            }else {
                min = array[i];
            }

        } System.out.println(min);
    }
}
