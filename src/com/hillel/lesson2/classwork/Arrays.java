package com.hillel.lesson2.classwork;

public class Arrays {
    public static void main(String[] args) {
        int [][] myMatrixArray = new int [3][3];
        int [][] myMatrixArrayField = {{1,2}, {1,3}};

        System.out.println(myMatrixArray);
        System.out.println(myMatrixArrayField);

        System.out.println(java.util.Arrays.toString(myMatrixArrayField));

        System.out.println(java.util.Arrays.deepToString(myMatrixArray));
        System.out.println(java.util.Arrays.deepToString(myMatrixArrayField));
    }
}
