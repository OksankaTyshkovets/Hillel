package com.hillel.lesson9.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {
    public Support(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }

    public boolean checkString(String str) throws IOException {
        boolean isContain = false;
        FileReader fileReader = new FileReader("Lesson9.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            if (fileString.equals(str)) {
                isContain = true;
            }
        }

        scanner.close();
        fileReader.close();

        System.out.println(isContain);
        return isContain;
    }


}
