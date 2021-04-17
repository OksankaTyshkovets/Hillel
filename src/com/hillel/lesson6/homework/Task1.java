package com.hillel.lesson6.homework;

public class Task1 {

    public static void main(String[] args) {
        String str = " Hillel is my feature. I will be developer ";
        isEmpty(str);
        lengthOfStr(str);
        lengthWithoutSpaces(str);
        outputI(str);
        cutOff(str);
        addSymbol(str);
        isEquals(str);
        stringToLowerCase(str);
        stringToUpperCase(str);
    }

    private static void isEmpty(String str){
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);
    }

    private static void lengthOfStr(String str){
        int length = str.length();
        System.out.println(length);
    }

    private static void lengthWithoutSpaces(String str){
        String newStr = str.trim();
        int lengthWithoutSpaces = newStr.length();
        System.out.println(lengthWithoutSpaces);
    }

    private static void outputI(String str){
        System.out.println(str.charAt(2));
    }

    private static void cutOff(String str){
        String newStr = str.substring(33, 42);
        System.out.println(newStr);
    }

    private static void addSymbol(String str){
        String newStr = str.concat("!");
        System.out.println(newStr);
    }

    private static void isEquals(String str){
        String stringForComparison = " Hillel is my feature. I will be DEVELOPER ";
        boolean isEquals = str.equals(stringForComparison);
        System.out.println(isEquals);
        boolean isEquals2 = str.equalsIgnoreCase(stringForComparison);
        System.out.println(isEquals2);
    }

    private static void stringToLowerCase(String str){
        System.out.println(str.toLowerCase());
    }

    private static void stringToUpperCase(String str){
        System.out.println(str.toUpperCase());
    }
}
