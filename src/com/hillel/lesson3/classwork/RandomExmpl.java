package com.hillel.lesson3.classwork;

import java.util.Random;

public class RandomExmpl {
    public static void main(String[] args) {
        Random randomVariable = new Random(2L);
        System.out.println(randomVariable.nextInt(6));
    }
}
