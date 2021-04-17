package com.hillel.lesson13.classwork;

import java.util.*;

public class SetExamples {

    static SortStudentsByName sortStudentByName = new SortStudentsByName();

    static Set<String> myHashSet = new HashSet<>();
    static Set<String> myLinkedHashSet = new LinkedHashSet<>();
    static Set<String> myTreeSet = new TreeSet<>();
    static Set<Integer> myIntTreeSet = new TreeSet<>();
    static Set<Student> myStudentTreeSet = new TreeSet<>();
    static List<Student> myStudentArrayList = new ArrayList<>();

    public static void main(String[] args) {
        String name1 = "Olga";
        String name2 = "Vova";
        String name3 = "Ekaterina";
        String name4 = "Alexandra";
        String name5 = "Yana";

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;
        int value4 = 4;
        int value5 = 5;

        myHashSet.add(name1);
        myHashSet.add(name2);
        myHashSet.add(name3);
        myHashSet.add(name4);
        myHashSet.add(name5);

        System.out.println(myHashSet);

        myLinkedHashSet.add(name1);
        myLinkedHashSet.add(name2);
        myLinkedHashSet.add(name3);
        myLinkedHashSet.add(name4);
        myLinkedHashSet.add(name5);

        System.out.println(myLinkedHashSet);

        myTreeSet.add(name1);
        myTreeSet.add(name2);
        myTreeSet.add(name3);
        myTreeSet.add(name4);
        myTreeSet.add(name5);

        System.out.println(myTreeSet);

        myIntTreeSet.add(value3);
        myIntTreeSet.add(value2);
        myIntTreeSet.add(value1);
        myIntTreeSet.add(value4);
        myIntTreeSet.add(value5);

        System.out.println(myIntTreeSet);

        Student vlad = new Student("Vlad", 18);
        Student alexandra = new Student("Alexandra", 19);
        Student evgeniy = new Student("Evgeniy", 20);

//        myStudentTreeSet.add(vlad);
//        myStudentTreeSet.add(alexandra);
//        myStudentTreeSet.add(evgeniy);

        myStudentArrayList.add(vlad);
        myStudentArrayList.add(alexandra);
        myStudentArrayList.add(evgeniy);

        Collections.sort(myStudentArrayList, sortStudentByName);
        System.out.println(myStudentArrayList);
    }
}
