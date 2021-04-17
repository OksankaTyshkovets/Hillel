package com.hillel.lesson3.homework;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
       int intRandom1 = new Random().nextInt();
        int intRandom2 = new Random().nextInt();
        int intRandom3 = new Random().nextInt();
        double doubleRandom1 = new Random().nextDouble();
        double doubleRandom2 = new Random().nextDouble();
        double doubleRandom3 = new Random().nextDouble();

        double sum = intRandom1 + intRandom2 + intRandom3 + doubleRandom1 + doubleRandom2 + doubleRandom3;
        System.out.println(sum);
    }
}
