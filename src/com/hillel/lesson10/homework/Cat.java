package com.hillel.lesson10.homework;

public final class Cat extends Mammal {
    private  String catName;
    private int catAge;

    public void play(){
        System.out.println("I'm playing, meow. Don't touch me");
    }


    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Override
    public void move() {
        System.out.println("Tygydyk - tygydyk");
    }

    @Override
    public void voice() {
        System.out.println("Mrrrrr");
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }
}
