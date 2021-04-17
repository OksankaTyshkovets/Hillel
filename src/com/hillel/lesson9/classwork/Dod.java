package com.hillel.lesson9.classwork;

public class Dod extends Animal {
    public Dod(String name, int age) {
        super(name, age);
    }

    @Override
    public void getAnimalSound() {
        System.out.println("Dog sound: Gav");
    }
}
