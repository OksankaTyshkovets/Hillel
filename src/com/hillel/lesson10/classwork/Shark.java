package com.hillel.lesson10.classwork;

public class Shark extends Fish implements AttackBehavior, EatBehavior {

    private String name;

    public Shark(String animalType, String name) {
        super(animalType);
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " start to swim");
    }

    @Override
    public void move() {
        System.out.println(name + " start to move");
    }

    @Override
    public void attack(Animal animal) {
        System.out.println(name.concat("  start attack "));
    }

    @Override
    public void eat() {
        System.out.println(name.concat("  start eat"));
    }
    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }
}
