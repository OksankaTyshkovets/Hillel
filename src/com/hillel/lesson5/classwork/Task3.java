package com.hillel.lesson5.classwork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        scanner.close();

        int firstDigit = digit / 100;
        int secondDigit = digit / 10 % 10;
        int thirdDigit = digit % 10;

        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
    }
}
