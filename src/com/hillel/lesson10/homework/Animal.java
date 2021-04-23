package com.hillel.lesson10.homework;

public abstract class Animal implements AnimalActivity, AnimalLifeCycle {
    private String type;
    private double weight;

    public abstract void voice();

    public void born(){
        System.out.println("Hello world");
    }

    public void eat(){
        System.out.println("Om-nom-nom");
    }

    public void crouch(){
        System.out.println("I fell like a shadow");
    }

    public void sleep(){
        System.out.println("zzzzzzz");
    }

    public void die(){
        System.out.println("Nya-poka");
    }
}
