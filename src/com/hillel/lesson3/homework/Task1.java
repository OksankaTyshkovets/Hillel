package com.hillel.lesson3.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = inputName();  // створюється змінна типу String, в яку передається результат роботи методу inputName()

        System.out.println("What is your surname?");
        String surname = inputSurname();  // створюється змінна типу String, в яку передається результат роботи методу inputSurname()

        System.out.println("How old are you?");
        int age =  inputAge(); // створюється змінна типу int, в яку передається результат роботи методу inputAge()

        System.out.println("Input your mail");
        String mail = inputMail(); // створюється змінна типу String, в яку передається результат роботи методу inputMail()

        System.out.println("Write some words about you");
        String about = inputAbout(); // створюється змінна типу String, в яку передається результат роботи методу inputAbout()

        System.out.println("Information about you");
        System.out.println(name + " " + surname + " " + age + " " + mail + " " + about); // виводяться всі введені дані
    }
    private static String inputName(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    private static String inputSurname(){
        Scanner scan = new Scanner(System.in);
        String surname = scan.nextLine();
        return surname;
    }

    private static int inputAge(){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        return age;
    }

    private static String inputMail(){
        Scanner scan = new Scanner(System.in);
        String mail = scan.nextLine();
        return mail;
    }

    private static String inputAbout(){
        Scanner scan = new Scanner(System.in);
        String about = scan.nextLine();
        scan.close();
        return about;
    }
}
