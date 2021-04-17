package com.hillel.lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        lottery();
    }

    private static void lottery(){
        System.out.println("Enter quantity of lottery participants");
        Scanner quantity = new Scanner(System.in);
        int inputQuantity = quantity.nextInt();
        System.out.println("Quantity of lottery participants: " + inputQuantity);

        quantity.close();

        Random winner = new Random();
        System.out.println(winner.nextInt(inputQuantity) + " is winner");

    }
}
