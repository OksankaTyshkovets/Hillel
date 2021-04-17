package com.hillel.lesson13.classwork;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>(5);
        List<String> stringArrayList2 = new ArrayList<>(5);
        List<String> stringArrayList3 = new ArrayList<>(5);
        //  interface can not be object
        //  List<String> notObject = new List();

        //  adding elements to ArrayList
        stringArrayList.add("name1");
        stringArrayList.add("name2");
        stringArrayList.add("name3");
        stringArrayList.add("name4");
        stringArrayList.add("name5");

        stringArrayList2.add("name6");
        stringArrayList2.add("name7");
        stringArrayList2.add("name8");
        stringArrayList2.add("name9");
        stringArrayList2.add("name10");

        stringArrayList3.add("name4");
        stringArrayList3.add("name5");

        System.out.println("before add all");
        System.out.println(stringArrayList);

        stringArrayList.addAll(stringArrayList2);

        System.out.println("after add all");
        System.out.println(stringArrayList);

        stringArrayList.removeAll(stringArrayList2);
        System.out.println("after remove all");
        System.out.println(stringArrayList);

        stringArrayList.retainAll(stringArrayList3);
        System.out.println("after retain all");
        System.out.println(stringArrayList);
    }
}
