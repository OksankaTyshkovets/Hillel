package com.hillel.lesson14.classwork;

public class BubbleSort {
    private long[] a;
    private int arraySize;

    public BubbleSort(int maxArraySize) {
        a = new long[maxArraySize];
        arraySize = 0;
    }

    public void insert(long value){
        a[arraySize] = value;
        arraySize++;
    }

    public void printArray(){
        for(int i = 0; i < arraySize; i++){
            System.out.println("array element: " + a[i] + " ");
        }
    }

    private void swap(int first, int second){
        long dump = a[first];
        a[first] = a[second];
        a[second] = dump;
    }

    public void myBubbleSort(){
        for(int out = arraySize - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(a[in] > a[in + 1]){
                    swap(in, in+1);
                }
            }
        }
    }
}
