package com.java.training.day1.class_design;

public class Animal {

    private String name;
     String species;

    public Animal(String name){
        this.name = name;

    }

     Animal eat() throws  IllegalArgumentException{
        System.out.println("Animal eats");
        return new Animal("");
    }
}
