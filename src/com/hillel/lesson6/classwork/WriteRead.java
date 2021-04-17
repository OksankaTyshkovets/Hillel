package com.hillel.lesson6.classwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteRead {
    static String pathToFile = "C:\\Users\\Oksana\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson6\\myTextFile.txt";
    public static void main(String[] args) throws IOException {
        writeToFile(pathToFile);

        readFromFile(pathToFile);
    }

    private static void writeToFile(String pathToFile) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile, true);
        fileWriter.write("Concat data to file\n");
        fileWriter.write("Test\n");
        fileWriter.write("My first writer data saved to file\n");
        fileWriter.write("My second writer data saved to file\n");

        fileWriter.close();
    }

    private static void readFromFile(String pathToFile) throws IOException {
       char[] myCharArray = new char[1000];

        FileReader fileReader = new FileReader(pathToFile);
        fileReader.read(myCharArray);

        System.out.println("File have been read");
        System.out.println(Arrays.toString(myCharArray));
        fileReader.close();
    }

}
