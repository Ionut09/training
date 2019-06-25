package com.java.training.day1.class_design;

public abstract class Feline extends Animal{
    public Feline(String name) {
        super(name);
    }

    public static void main(String[] args) {
//        new Feline();
//        new Domestic();
    }

    //private abstract void purr();
    public abstract void purr();
}
