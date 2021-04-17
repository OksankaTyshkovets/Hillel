package com.hillel.lesson8.classwork;

public class IncExmpl {
    private String name;
    private int age;
    private String sex;

    public IncExmpl(){
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Incorrect age");
            this.age = 0;
        }else{
        this.age = age;}
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("male" )|| sex.equals("female")){
        this.sex = sex;
        }else {
            System.out.println("incorrect sex");
            this.sex = "male";
        }
    }

    @Override
    public String toString() {
        return "IncExmpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
