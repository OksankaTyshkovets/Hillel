package com.hillel.lesson13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task2Class2 extends Task2Class1 {

    public Task2Class2(List list, Set set, Map map) {
        super(list, set, map);
    }

    public void method1(List list1, List list2){
        List<? extends Task2Class1> myList1 = new ArrayList<>(list1);
        List<? super Task2Class3> myList2 = new ArrayList<>(list2);

        System.out.println(myList1.toString());
        System.out.println(myList2.toString());
    }
}
