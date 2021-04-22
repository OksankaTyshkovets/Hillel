package com.hillel.lesson13.homework;
/* Создайте программу-опросник(Можно  вынести  в  отдельный класс с  необходимым(и) методом(ами)).
Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
Введенные данные  сохраняются в виде ключ-значение,  где ключ - это имя пользователя, а значение это данные  в  виде тоже ключ-значение
(где ключ - это вопрос, а значение - ответ). Тип значения ответа на  вопрос указать на  свое усмотрение.
После проведенного опроса программа должна записать результат в файл. */

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    static final Map<String, Map<String, String>> myLinkedHashMap1 = new LinkedHashMap<String, Map<String, String>>();
    static Map<String, String> myLinkedHashMap2 = new LinkedHashMap<>();
    static String name;
    static String answer1;
    static String answer2;

    static String question1;
    static String question2;

    public static void main(String[] args) throws IOException {

    questions();
    getMap();

    }

    private static void questions(){
        System.out.println("Input your name");
        Scanner scanner = new Scanner(System.in);
         name = scanner.nextLine();
         question1 = "How old are you?";
        System.out.println(question1);
         answer1 = scanner.nextLine();
         question2 = "Where are you from?";
        System.out.println(question2);
         answer2 = scanner.nextLine();
        scanner.close();
    }

    private static void getMap() throws IOException {
        myLinkedHashMap2.put(question1, answer1);
        myLinkedHashMap2.put(question2, answer2);

        myLinkedHashMap1.put(name, myLinkedHashMap2);

        FileWriter fileWriter = new FileWriter("Lesson13.txt");
        fileWriter.write(String.valueOf(myLinkedHashMap1));
        fileWriter.close();
    }
}
