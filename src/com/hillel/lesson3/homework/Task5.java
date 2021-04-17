package com.hillel.lesson3.homework;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        salary();
        salaryWithRandomClass();
    }

    private static int salary(){
        int minSalary = 10000;
        int maxSalary = 1000000;

        int mySalary = minSalary + (int) (Math.random() * maxSalary);
        System.out.println("My salary is " + mySalary);
        return mySalary;
    }

    private static void salaryWithRandomClass(){
        Random mySalary = new Random();
        System.out.println("My salary with Random class is " + mySalary.nextInt(1000000));

    }
}
