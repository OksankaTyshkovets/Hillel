package com.hillel.lesson14.classwork;

public class MyBubbleSortStarter {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(7);
        bubbleSort.insert(32);
        bubbleSort.insert(1);
        bubbleSort.insert(113);
        bubbleSort.insert(10321);
        bubbleSort.insert(8);
        bubbleSort.insert(100);
        bubbleSort.insert(5);

        System.out.println("before sorting");

        bubbleSort.printArray();
        bubbleSort.myBubbleSort();
        System.out.println("after sorting");
        bubbleSort.printArray();
    }
}
