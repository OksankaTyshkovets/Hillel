package com.hillel.lesson9.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String sex;
    private String country;

    public User(String name, String surname, String mail, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }

    public static final void read() throws IOException{
        FileReader fileReader = new FileReader("Lesson9.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            System.out.println(fileString);
        }
        System.out.println("File have been read");

        scanner.close();
        fileReader.close();
    }

    public static void write() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("Lesson9.txt");
        fileWriter.write(text);

        scanner.close();
        fileWriter.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
