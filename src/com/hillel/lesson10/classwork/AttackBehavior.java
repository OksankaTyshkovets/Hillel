package com.hillel.lesson10.classwork;

public interface AttackBehavior {

    String test = "test";

    void attack(Animal animal);

    default void  attack(){
        System.out.println("Default attack");
    }
}
