package com.hillel.lesson10.homework;

public final class Monkey extends Mammal {
    private String monkeyName;
    private int monkeyAge;

    public void steelMoney(){
        System.out.println("Give me your money, or I will kill you");
    }

    public Monkey(String monkeyName, int monkeyAge) {
        this.monkeyName = monkeyName;
        this.monkeyAge = monkeyAge;
    }

    public String getMonkeyName() {
        return monkeyName;
    }

    public void setMonkeyName(String monkeyName) {
        this.monkeyName = monkeyName;
    }

    public int getMonkeyAge() {
        return monkeyAge;
    }

    public void setMonkeyAge(int monkeyAge) {
        this.monkeyAge = monkeyAge;
    }

    @Override
    public void move() {
        System.out.println("viiiiii");
    }

    @Override
    public void voice() {
        System.out.println("uuu-uuuu");
    }
    @Override
    public void makeSound() {
        System.out.println("banana");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "monkeyName='" + monkeyName + '\'' +
                ", monkeyAge=" + monkeyAge +
                '}';
    }

}
