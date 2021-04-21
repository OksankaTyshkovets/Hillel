package com.hillel.lesson13.classwork;

import java.util.*;

public class mapExample {

    static Map<String, String> myHashMap = new HashMap<>();
    static Map<String, String> myLinkedHashMap = new LinkedHashMap<>();
    static Map<String, String> myTreeMap = new TreeMap<>();

    public static void main(String[] args) {
        String key1 = "key1";
        String key2 = "key2";
        String key3 = "key3";
        String key4 = "key4";
        String key5 = "key5";

        String country1 = "Ukraine";
        String country2 = "Spain";
        String country3 = "Italy";
        String country4 = "Canada";
        String country5 = "Lithia";

        myHashMap.put(key1, country1);
        myHashMap.put(key2, country2);
        myHashMap.put(key3, country3);
        myHashMap.put(key4, country4);
        myHashMap.put(key5, country5);

        System.out.println(myHashMap);

        myLinkedHashMap.put(key1, country1);
        myLinkedHashMap.put(key2, country2);
        myLinkedHashMap.put(key3, country3);
        myLinkedHashMap.put(key4, country4);
        myLinkedHashMap.put(key5, country5);

        System.out.println(myLinkedHashMap);

        myTreeMap.put(key1, country1);
        myTreeMap.put(key2, country2);
        myTreeMap.put(key3, country3);
        myTreeMap.put(key4, country4);
        myTreeMap.put(key5, country5);

        System.out.println(myTreeMap);

        String firstValue = myHashMap.get(key1);

        // for iteration for Map
        for(Map.Entry<String, String> entry : myHashMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key is ".concat(key));
            System.out.println("value is ".concat(value));
        }

        Iterator<Map.Entry<String, String>> iterator = myHashMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("while loop key is ".concat(key));
            System.out.println("while loop value is ".concat(value));
        }

        for (String key : myHashMap.keySet()){
            System.out.println("foreach loop key is ".concat(key));
        }

        for (String value : myHashMap.values()) {
            System.out.println("foreach loop value is ".concat(value));
        }
    }
}
