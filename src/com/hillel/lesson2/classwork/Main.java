package com.hillel.lesson2.classwork;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("text");

        boolean trueValue = true;
        boolean falseValue = false;

        boolean result = trueValue && falseValue;
        boolean result2 = trueValue || falseValue;

        System.out.println(result);
        System.out.println(result2);

        System.out.println("--------------------------------------------------------");

        int a = 1;
        int b = ++a;

        int c = 1;
        int d = c++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int x = 10;
        int y = --x;

        int x2 = 10;
        int y2 = x2--;

        System.out.println(x);
        System.out.println(y);
        System.out.println(x2);
        System.out.println(y2);*/

        short shortVariable = 1;
        byte byteVariable = 10;
        int intVariable = 1000;
        long longVariable = 10000;
        float floatVariable = 10.5f;
        double doubleVariable = 15.5;

//        System.out.println(byteVariable + shortVariable);
//        System.out.println(intVariable + longVariable);

        shortVariable = byteVariable;
        System.out.println();
       // byteVariable = (byte) shortVariable;

        doubleVariable = floatVariable;
      //  floatVariable = (float) doubleVariable;

//        intVariable = (int) floatVariable;
//
//        System.out.println(intVariable);

        //------------------------------------------------------------

        int[] myArray = new int [10];
        int[] myArrayFilled = {12, 232, 456, 1, 54, 32, 98, 112};

        Arrays.binarySearch(myArrayFilled, 54);
        Arrays.binarySearch(myArrayFilled, 200);

        System.out.println(Arrays.binarySearch(myArrayFilled, 54));
        System.out.println(Arrays.binarySearch(myArrayFilled, 200));

//        String[] names = {"Nik", "Alena", "Dima", "Sasha"};
//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);
//
//        String myName = names [2];
//        System.out.println(myName);
//
//        Arrays.sort(myArrayFilled);
//        Arrays.sort(names);
//
//        System.out.println(Arrays.toString(myArrayFilled));
//        System.out.println(Arrays.toString(names));

//        char c = '3';
//        char b = 'c';
//        int d = 10;
//
//        System.out.println(d + c);


    }
}
