package com.hillel.lesson9.homework;

import java.io.File;

public final class Admin extends User {
    public Admin(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }

    public void removeFile(boolean isContain){
        if(isContain){
            File file = new File("Lesson9.txt");
            file.delete();
        }
    }
}
