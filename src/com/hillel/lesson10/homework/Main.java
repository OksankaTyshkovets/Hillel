package com.hillel.lesson10.homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Dog dog = new Dog("Lord", 12);
        Monkey monkey = new Monkey("Abu", 20);

        Rose rose = new Rose("bush rose", "White");
        Tulip tulip = new Tulip("Dutch tulip", "Yellow");
        Orchid orchid = new Orchid("Home orchid", "Violet");

        AnimalBehavior animalBehavior;
        AnimalActivity animalActivity;
        AnimalLifeCycle animalLifeCycle;

        PlantsActivity plantsActivity;
        PlantsInteract plantsInteract;

        System.out.println(cat);

        cat.born();
        cat.eat();
        cat.play();
        cat.move();
        cat.makeSound();
        cat.voice();
        cat.crouch();
        cat.sleep();
        cat.die();

        System.out.println(dog);

        dog.born();
        dog.eat();
        dog.bite();
        dog.move();
        dog.makeSound();
        dog.voice();
        dog.crouch();
        dog.sleep();
        dog.die();

        System.out.println(monkey);

        monkey.born();
        monkey.eat();
        monkey.steelMoney();
        monkey.move();
        monkey.makeSound();
        monkey.voice();
        monkey.crouch();
        monkey.sleep();
        monkey.die();

        System.out.println(rose);

        rose.plant();
        rose.grow();
        rose.getPhotosynthesis();
        rose.getSmell();
        rose.water();
        rose.riseUpPrise();
        rose.wither();

        System.out.println(orchid);

        orchid.plant();
        orchid.grow();
        orchid.getPhotosynthesis();
        orchid.getSmell();
        orchid.water();
        orchid.drinkWater();
        orchid.wither();

        System.out.println(tulip);

        tulip.plant();
        tulip.grow();
        tulip.getPhotosynthesis();
        tulip.getSmell();
        tulip.water();
        tulip.makeBouquet();
        tulip.wither();
    }
}
