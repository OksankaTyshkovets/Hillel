package com.hillel.lesson4.classwork;

public class IfElseOperations {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

//        if(c > b){
//            System.out.println("first if check is true");
//        }else if(b > a){
//            System.out.println("second if check is true");
//        }else{
//            System.out.println("always false because 3>2 and 2>1");
//        }

        String[] cats = {"Kurzik", "Barsik", "Dexter", "Kotik", "Bizik"};
        for (int i = 0; i < cats.length; i++) {
            String catName = cats[i];

            if ((!catName.startsWith("K") && !catName.startsWith("B"))) {
                System.out.println("That's Dexter cat!!!" + catName);
                break;
            } else if (catName.startsWith("K")) {
                System.out.println("Cat sex is male and name is " + catName);
            } else if (catName.startsWith("B")) {
                System.out.println("Cat sex is female and name is " + catName);
            }

        }
    }
}
