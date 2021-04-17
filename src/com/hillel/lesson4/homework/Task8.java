package com.hillel.lesson4.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter you age");
        Scanner age = new Scanner(System.in);
        int inputAge = age.nextInt();
        age.close();

        if(inputAge < 18){
            System.out.println("Вход строго с 18 лет");
        }else if(inputAge >= 18 && inputAge <= 50){
            System.out.println("Добро пожаловать");
        }else {
            System.out.println("Вам будет не интересно на этом сайте");
        }
    }
}
