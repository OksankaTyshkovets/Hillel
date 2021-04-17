package com.hillel.lesson8.classwork;

public class ClassMain {
    public static void main(String[] args) {
        IncExmpl incExmpl;
        incExmpl = new IncExmpl();

        incExmpl.setName("My name");
        incExmpl.setAge(5);
        incExmpl.setSex("male");

        System.out.println(incExmpl);

        IncExmpl incorectIncExmpl = new IncExmpl();
        incorectIncExmpl.setAge(-1);
        incorectIncExmpl.setSex("unknow");

        System.out.println(incorectIncExmpl);
    }
}
