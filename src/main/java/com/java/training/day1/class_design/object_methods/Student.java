package com.java.training.day1.class_design.object_methods;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }

        Student studentToBeCompared = (Student) o;
        return this.name.equals(studentToBeCompared.name) && this.age == studentToBeCompared.age;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
