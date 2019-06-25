package com.java.training.day1.class_design;

public class Canine extends  Animal {

    public Canine(String name) {
        super(name);
    }

    public Canine() {
        //super("Canine");
        this("Canine");
        species = "Canine";
    }

    @Override
    public Wolf eat(){ //signatures must match exactly
        System.out.println("Canine eats");
        return new Wolf();
    }


}
