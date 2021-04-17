package com.hillel.lesson10.classwork;

public class ParClass {
    private String parentName;

    public ParClass(String parentName) {
        this.parentName = parentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void printSmthToConsole(){
        System.out.println("this is parent class");
    }

    public void printSmthToConsole(String str){
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "ParClass{" +
                "parentName='" + parentName + '\'' +
                '}';
    }
}
