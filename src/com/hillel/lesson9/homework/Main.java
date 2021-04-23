package com.hillel.lesson9.homework;

import java.io.IOException;


public class Main  {
    static boolean isContain;
    public static void main(String[] args) throws IOException {
        User user = new User("Oksana", "Tyshkovets", "oksanatyshkovets6@gmail.com", "123445", "F", "Ukraine");
        Admin admin = new Admin("Oksana", "Tyshkovets", "oksanatyshkovets6@gmail.com", "123445", "F", "Ukraine");
        Support support  = new Support("Oksana", "Tyshkovets", "oksanatyshkovets6@gmail.com", "123445", "F", "Ukraine");

        method(user);
        method(support);
        method(admin);
    }

    public static void method(Object user) throws IOException {
        if(user instanceof Admin){
            ((Admin) user).removeFile(isContain);
        } else if (user instanceof Support){
           isContain = ((Support)user).checkString("1234");
        } else if (user instanceof User) {
            ((User) user).write();
        }
    }
}
