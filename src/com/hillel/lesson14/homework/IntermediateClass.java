package com.hillel.lesson14.homework;

import java.io.IOException;

public class IntermediateClass {
    MyClassWithCheckedExceptions myClassWithCheckedExceptions = new MyClassWithCheckedExceptions();

    public void firstExceptionWith() throws IOException {
        myClassWithCheckedExceptions.firstException();
    }

    public void secondExceptionWith() throws IllegalArgumentException{
        myClassWithCheckedExceptions.secondException();
    }

    public void thirdExceptionWith() throws ArithmeticException{
        myClassWithCheckedExceptions.thirdException();
    }
}
