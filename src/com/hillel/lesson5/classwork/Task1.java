package com.hillel.lesson5.classwork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter name");
        name();
    }

    private static String name() {
        Scanner name = new Scanner(System.in);
        String myName = name.nextLine();
        name.close();

        if(myName.equals("Hillel")){
            System.out.println("Добро пожаловать на курс");
        }else{
            System.out.println("Добро пожаловать " + myName);
        }
        return myName;
    }
}
