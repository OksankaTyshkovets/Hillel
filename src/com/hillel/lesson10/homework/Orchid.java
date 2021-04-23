package com.hillel.lesson10.homework;

public final class Orchid extends Flower {
    private String orchidType;
    private String orchidColour;

    public void drinkWater(){
        System.out.println("Give me some water, I want to get fucking drunk");
    }

    public Orchid(String orchidType, String orchidColour) {
        this.orchidType = orchidType;
        this.orchidColour = orchidColour;
    }

    public String getOrchidType() {
        return orchidType;
    }

    public void setOrchidType(String orchidType) {
        this.orchidType = orchidType;
    }

    public String getOrchidColour() {
        return orchidColour;
    }

    public void setOrchidColour(String orchidColour) {
        this.orchidColour = orchidColour;
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
        return "Orchid{" +
                "orchidType='" + orchidType + '\'' +
                ", orchidColour='" + orchidColour + '\'' +
                '}';
    }
}
