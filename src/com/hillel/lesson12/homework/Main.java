package com.hillel.lesson12.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        method1(list);
        method2(list);
    }

    public static List method1(List list){
       if (list.isEmpty()){
           for (int i = 0; i < 6; i++){
               list.add(new FirstClass());
           }
       }

        for (int i = 0; i < 3; i++){
            list.add(i, new SecondClass());
        }

        for(int i = list.size() - 1; i > list.size() - 4; i--){
            list.set(i, new ThirdClass());
        }

        System.out.println(list.toString());
        return list;
    }

    public static List method2(List list){
        int a = 0;
        int b = 0;
        int c = 0;

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next().equals(new FirstClass()) && a < 2){
                a++;
            } else if (iterator.next().equals(new SecondClass()) && b < 2){
                b++;
            } else if (iterator.next().equals(new ThirdClass()) && c < 2){
                c++;
            } else {
                iterator.remove();
            }
        }

        System.out.println(list.toString());
        return list;
    }
}
