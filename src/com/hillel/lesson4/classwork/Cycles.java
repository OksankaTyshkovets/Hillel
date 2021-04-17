package com.hillel.lesson4.classwork;

public class Cycles {
    public static void main(String[] args) {

    // while operator

//        int a = 100;
//        int b = 500;
//
//        while (a < b){
//            System.out.println("Cycle operation running: ");
//            a += 100;
//            System.out.println("A value: " + a);
//        }
//
//        String myName = "Oksana";
//        String friendNameOksana = "Oksana";
//        String friendName = "Igor";
//
//        while (myName.equals(friendNameOksana)){
//            friendNameOksana = friendName;
//            System.out.println("friendNameOksana value " + friendName);
//        }
//
//        // do_while operator
//
//        int x = 1;
//        int y = 50;
//
//        do {
//            System.out.println("x value is: " + x);
//            System.out.println("y value is: " + y);
//            System.out.println("first cycle starting");
//            y = y - 5;
//            System.out.println("first cycle ending");
//        } while (x < y);
//        {
//            System.out.println("first cycle starting");
//            y = y - 5;
//            System.out.println("first cycle ending");
//        }

    // for operator

//        int x= 25;
//
//        for (int i = 1; i < x; i++) {
//            System.out.println("starting cycle");
//            System.out.println("i value is: " + i);
//        }

    int[] myDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int myDigitLength = myDigits.length;
//
//        for (int i = 0; i < myDigitLength; i++) {
//            System.out.println(myDigits[i]);
//        }

    for (int i = 0; i < myDigits.length;){
        i++;
        System.out.println(myDigits[i]);
    }
}
}
