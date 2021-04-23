package com.hillel.lesson10.homework;

public final class Dog extends Mammal {
    private String dogName;
    private int dogAge;

    public void bite(){
        System.out.println("Gav gav, I will bite you");
    }

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public void move() {
        System.out.println("run");
    }

    @Override
    public void voice() {
        System.out.println("rrrrrr");
    }

    @Override
    public void makeSound() {
        System.out.println("Gav-gav");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
