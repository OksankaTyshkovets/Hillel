package com.hillel.lesson13.homework;

import java.util.*;

public class Task2Main {
    public static void main(String[] args) {
        List methodList1 = new ArrayList();
        List methodList2 = new ArrayList();

        List list = new ArrayList();
        Set set = new TreeSet();
        Map map = new LinkedHashMap();

        Task2Class2 obj = new Task2Class2(list, set, map);

        methodList1.add("1");
        methodList1.add("2");
        methodList1.add("3");

        methodList2.add("4");
        methodList2.add("5");
        methodList2.add("6");

        System.out.println(methodList1.toString());
        System.out.println(methodList2.toString());

        obj.method1(methodList1, methodList2);
    }
}
