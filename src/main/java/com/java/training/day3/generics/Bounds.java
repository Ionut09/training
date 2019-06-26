package com.java.training.day3.generics;

import com.java.training.day1.building_blocks.Dog;
import com.java.training.day1.class_design.Domestic;
import com.java.training.day2.io.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bounds {

    private static void unbounded(List<?> list) {
    }

    private static void upper(Set<? extends Serializable> set) {//extends for classes and interfaces

    }

    private static void lower(List<? super Dog> list) {

    }

    public static void main(String[] args) {
        upper(new HashSet<Integer>());
        unbounded(new ArrayList<String>());
        unbounded(new ArrayList());
        lower(new ArrayList<Domestic>());
    }

}
