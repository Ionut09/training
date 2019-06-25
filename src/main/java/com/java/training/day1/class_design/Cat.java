package com.java.training.day1.class_design;

import java.io.Serializable;

public class Cat extends Feline implements Domestic, Serializable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void purr() {
        System.out.println("Cat purr");
    }
    @Override
    public void eats() {
        System.out.println("Cat eats");
    }
}
