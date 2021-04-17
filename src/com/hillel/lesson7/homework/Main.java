package com.hillel.lesson7.homework;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Barsik");
        Cat cat3 = new Cat("Ryzhyk", 3);
        Cat cat4 = new Cat("Pushok", 5, "Black");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Rex");
        Dog dog3 = new Dog("Chappy", 6);
        Dog dog4 = new Dog("Lord", 12, "White");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        cat1.name = "Tishka";
        cat1.age = 5;
        cat1.color = "ginger";
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.color);

        cat1.setName("Kiddy");
        cat1.setAge(6);
        cat1.setColor("White");
        System.out.println(cat1.getName() + " " + cat1.getAge() + " " + cat1.getColor());

        dog1.name = "Archy";
        dog1.age = 8;
        dog1.color = "black";
        System.out.println(dog1.name + " " + dog1.age + " " + dog1.color);

        dog1.setName("Chak");
        dog1.setAge(2);
        dog1.setColor("White");
        System.out.println(dog1.getName() + " " + dog1.getAge() + " " + dog1.getColor());
    }
}
