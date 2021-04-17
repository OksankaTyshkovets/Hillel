package com.hillel.lesson13.classwork;

import java.util.ArrayList;

public class PrimitivesClassExamples {
    public static void main(String[] args) {
        String aString = "1";
        int a =1;
        long b = 2;
        double c = 2.0d;
        boolean d = false;

        Integer integerStringValue = Integer.valueOf(aString);
        Integer integerIntValue = Integer.valueOf(a);
        Long longValue = Long.valueOf(b);
        Double doubleValue = Double.valueOf(c);
        Boolean booleanValue = Boolean.valueOf(d);

        ArrayList<String> myList = new ArrayList<>();

        ArrayList<? extends Student> myStudentChildList = new ArrayList<>();
    }
}
