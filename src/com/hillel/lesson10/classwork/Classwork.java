package com.hillel.lesson10.classwork;

public class Classwork {
    public static void main(String[] args) {
//        ParClass parClass = new ParClass("Parent");
//        ChildClass childClass = new ChildClass("Child");
//        parClass.printSmthToConsole();
//        childClass.printSmthToConsole();
//        parClass.printSmthToConsole("test");
//        childClass.printSmthToConsole("test2");
//
//      //  ParentAbstractClass parentAbstractClass =
//
//        ChildNotAbstractClass childNotAbstractClass = new ChildNotAbstractClass();

        Eagle eagle = new Eagle("bird", "eagle");
        Shark shark = new Shark("fish","Shark");
        Elephant elephant = new Elephant("mamal","Elephant");

        eagle.fly();
        shark.swim();
        elephant.run();

        eagle.attack(shark);
        eagle.eat();

        shark.attack();


    }
}
