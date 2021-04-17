package com.hillel.lesson8.homework;

public class Wardrobe {
    private int height;
    private int length;
    private int width;

    public Wardrobe(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
