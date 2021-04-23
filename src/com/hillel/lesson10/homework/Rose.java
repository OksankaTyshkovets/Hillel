package com.hillel.lesson10.homework;

public final class Rose extends Flower {
    private String roseType;
    private String roseColour;


    public void riseUpPrise(){
        System.out.println("Take my money, I want this fucking shit");
    }

    public Rose(String roseType, String roseColour) {
        this.roseType = roseType;
        this.roseColour = roseColour;
    }

    public String getRoseType() {
        return roseType;
    }

    public void setRoseType(String roseType) {
        this.roseType = roseType;
    }

    public String getRoseColour() {
        return roseColour;
    }

    public void setRoseColour(String roseColour) {
        this.roseColour = roseColour;
    }

    @Override
    public void getSmell() {
        System.out.println("Smells like teen spirit");
    }

    @Override
    public void getPhotosynthesis() {
        System.out.println("breath");
    }

    @Override
    public String toString() {
        return "Rose{" +
                "roseType='" + roseType + '\'' +
                ", roseColour='" + roseColour + '\'' +
                '}';
    }
}
