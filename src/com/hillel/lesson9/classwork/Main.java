package com.hillel.lesson9.classwork;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("MyAnimal", 5);

//        WildAnimal wildAnimal = new WildAnimal("myWildAnimal", 7);

//        Animal myWildAnimal = wildAnimal;
//        System.out.println(myWildAnimal);



        System.out.println(animal);
        animal.getAnimalSound();

        Cat cat = new Cat("MyCat", 10);
        cat.getAnimalSound();

        System.out.println(cat);

        cat.setAge(16);

        System.out.println(cat);

        cat.play();
        cat.play();
        cat.play();
        cat.play();
        cat.play();

        WildAnimal wildAnimal = new WildAnimal("myWildAnimal", 1);

        boolean isAnimalChildOfWildAnimal = animal instanceof WildAnimal;
        boolean isCatChildOfAnimal = wildAnimal instanceof Animal;

        if(isAnimalChildOfWildAnimal){
            WildAnimal myAnimalWild = (WildAnimal) animal;
        }

        if(isCatChildOfAnimal){
            Animal animal2 = cat;
        }
        System.out.println(wildAnimal);

        Dod dog = new Dod("MyDog", 15);
        dog.getAnimalSound();
        System.out.println(dog);
        dog.setAge(20);
        System.out.println(dog);

        System.out.println("Now present class Animal");
        System.out.println(animal);

    }
}
