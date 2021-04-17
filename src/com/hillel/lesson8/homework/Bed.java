package com.hillel.lesson8.homework;

public class Bed {
    private float size;
    private int weight;

    public Bed(float size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "size=" + size +
                ", weight=" + weight +
                '}';
    }
}
