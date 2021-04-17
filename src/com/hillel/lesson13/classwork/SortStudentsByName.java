package com.hillel.lesson13.classwork;

import java.util.Comparator;

public class SortStudentsByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

