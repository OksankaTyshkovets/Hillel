package com.hillel.lesson8.homework;

public class House {
    public static void main(String[] args) {
        Bed bed = new Bed(1.5f, 30);
        System.out.println(bed);
        Table table = new Table(4, 2, 1);
        System.out.println(table);
        Wardrobe wardrobe = new Wardrobe(4, 5, 6);
        System.out.println(wardrobe);


        //  created new object Task3 class

        Task3 task3 = new Task3(1);
        System.out.println(task3);

    }
}
