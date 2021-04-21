package com.hillel.lesson9.homework;

import java.io.IOException;


public class Main  {
    public static void main(String[] args) throws IOException {
        User user = new User("Oksana", "Tyshkovets", "oksanatyshkovets6@gmail.com", "123445", "F", "Ukraine");
        Admin admin = new Admin("Oksana", "Tyshkovets", "oksanatyshkovets6@gmail.com", "123445", "F", "Ukraine");
        Support support  = new Support("Oksana", "Tyshkovets", "oksanatyshkovets6@gmail.com", "123445", "F", "Ukraine");

        method(user);
        method(support);
        method(admin);
    }

    public static void method(Object user) throws IOException {
        if(user instanceof User){
            ((User) user).write();
        } else if (user instanceof Support){
            ((Support)user).checkString(new String("1234"));
        } else if (user instanceof Admin) {
            ((Admin) user).removeFile(false);
        }
    }
}
