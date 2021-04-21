package com.hillel.lesson14.classwork;

public class MyCustomRuntimeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "my Custom runtime Exception is there";
    }
}
