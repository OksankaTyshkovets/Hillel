package com.hillel.lesson10.homework;

public final class Tulip extends Flower {
    private String tulipType;
    private String tulipColour;

    public void makeBouquet(){
        System.out.println("I dont't want to live anymore. Take knife - cut");
    }

    public Tulip(String tulipType, String tulipColour) {
        this.tulipType = tulipType;
        this.tulipColour = tulipColour;
    }

    public String getTulipType() {
        return tulipType;
    }

    public void setTulipType(String tulipType) {
        this.tulipType = tulipType;
    }

    public String getTulipColour() {
        return tulipColour;
    }

    public void setTulipColour(String tulipColour) {
        this.tulipColour = tulipColour;
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
        return "Tulip{" +
                "tulipType='" + tulipType + '\'' +
                ", tulipColour='" + tulipColour + '\'' +
                '}';
    }
}
