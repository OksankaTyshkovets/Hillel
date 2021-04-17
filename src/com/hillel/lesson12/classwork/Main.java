package com.hillel.lesson12.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(5);

        myList.add("name1");
        myList.add("name2");
        myList.add("name3");
        myList.add("name4");
        myList.add("name5");

        System.out.println(myList);

        String arrayElement2 = myList.get(2);
        System.out.println(arrayElement2);

        myList.set(2, "updatedName3");
        System.out.println(myList);

        int myListSize = myList.size();

        myList.set(4, null);

        System.out.println(myList);

        Iterator iterator = myList.iterator();

        while (iterator.hasNext()){
            String iteratorData = (String) iterator.next();
            System.out.println("myList data element: ".concat(iteratorData));
        }
    }
}
