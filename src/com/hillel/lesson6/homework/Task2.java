package com.hillel.lesson6.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
  //  static String pathToFile = "C:\\Users\\Oksana\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson6\\homework\\myTextFile.txt";
    public static void main(String[] args) throws IOException {
        writeToFile();
        readFromFile();
    }

    private static void writeToFile() throws IOException{
        FileWriter fileWriter = new FileWriter("myFile.txt");
        fileWriter.write("І капітани чорної зими,\nтікаючи від втоми та тюрми,\nвже сваряться заведено в імлі,\nзатоплюючи власні кораблі.");

        fileWriter.close();
    }

    private static void readFromFile() throws IOException{
        FileReader fileReader = new FileReader("myFile.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            System.out.println(fileString);
        }
        System.out.println("File have been read");

        scanner.close();
        fileReader.close();
    }
}
