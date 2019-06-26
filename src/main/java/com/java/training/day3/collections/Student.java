package com.java.training.day3.collections;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student implements Comparable<Student>{

    private String name;
    private int age;


    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
