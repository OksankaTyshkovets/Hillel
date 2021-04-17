package com.hillel.lesson8.homework;

public class Task2 {
    private final int A;
    private final int B;
    private final int C;

    public Task2() {
        this.A = 4;
        this.B = 9;
        this.C = 3;
    }

    public Task2(int a, int b, int c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }


    public int getA() {
        return A;
    }


    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    // set методи не потрібно реалізовувати, тому що значення для final змінних задаються або за допомогою знаку присвоєння при оголошенні
    // або в конструкторі класу



}
