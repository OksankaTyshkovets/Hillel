package com.hillel.lesson8.homework;

public class Table {
    private int length;
    private int width;
    private int height;

    public Table(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Table{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
