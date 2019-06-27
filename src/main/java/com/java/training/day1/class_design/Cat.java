package com.java.training.day1.class_design;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class Cat extends Feline implements Domestic, Serializable {
    private String name;

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("pisi");
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
