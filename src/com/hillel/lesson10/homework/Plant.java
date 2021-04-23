package com.hillel.lesson10.homework;

public abstract class Plant implements PlantsActivity {
    private String type;
    private int height;

    public abstract void getPhotosynthesis();

    public void plant(){
        System.out.println("Hello world");
    }

    public void wither(){
        System.out.println("Nya-poka");
    }

    public void grow(){
        System.out.println("I'm so big");
    }
    public void water(){
        System.out.println("Life is beautiful");
    }
}
