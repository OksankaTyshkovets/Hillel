package com.hillel.lesson3.classwork;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        java.util.Scanner scannerText = new java.util.Scanner("Summer is coming \n The weather is going to be nice");
//
//        String scannerOutput = scannerText.nextLine();
//        String scannerOutputSecondLine = scannerText.nextLine();
//
//        System.out.println(scannerOutput);
//        System.out.println(scannerOutputSecondLine);
//
//        String myName = keyboardScannerInput();
//        int myAge = keyboardScannerInputInteger();
//        System.out.println(myName);
//        System.out.println("Nice age " + myAge);

        Scanner scannerMyText = new Scanner(System.in);
        int enteredText = scannerMyText.nextInt();
        System.out.println(enteredText);
        scannerMyText.close();


    }

    private static String keyboardScannerInput() {
        System.out.println("Enter your name ");

        java.util.Scanner scannerInput = new java.util.Scanner(System.in);

        String enteredName = scannerInput.nextLine();

//        scannerInput.close();

        return enteredName + " nice to meet you";
    }

    private static int keyboardScannerInputInteger() {
        System.out.println("Enter your age ");

        java.util.Scanner scannerInput = new java.util.Scanner(System.in);

        int enteredAge = scannerInput.nextInt();

        scannerInput.close();

        return enteredAge;
    }
}
