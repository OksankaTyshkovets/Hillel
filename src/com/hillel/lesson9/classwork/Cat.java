package com.hillel.lesson9.classwork;

public class Cat extends Animal {

    private int energy;

    public Cat(String name, int age) {
        super(name, age);
        this.energy = 100;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("cat sound: Myaw");
    }

    public void play(){
        if(energy > 0){
        System.out.println("Cat is playing");
            energy = energy - 30;
        System.out.println("cat enegrgy: " + energy);
        }else {
            System.out.println("cat is tired: energy is low level");
        }
    }
}
