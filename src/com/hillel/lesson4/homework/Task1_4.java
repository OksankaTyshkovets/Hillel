package com.hillel.lesson4.homework;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        outputWithWhile();
        System.out.println("Task 2");
        outputWithFor();
        System.out.println("Task 3");
        outputDecreaseWithWhile();
        System.out.println("Task 4");
        outputDecreaseWithFor();
    }

    private static void outputWithWhile(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }

    private static void outputWithFor(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    private static void outputDecreaseWithWhile(){
        int i = 100;
        while (i >= 0){
            System.out.println(i);
            i -= 10;
        }
    }

    private static void outputDecreaseWithFor(){
        for (int i = 100; i >= 0; i -= 10){
            System.out.println(i);
        }
    }
}
