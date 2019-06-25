package com.java.training.day1.class_design;

public class Wolf extends Canine {

    public Wolf() {
        super();
        species = "Wolf";
//        toString();
//        equals("");  din clasa Object
//        hashCode();
    }

    @Override
    public Wolf eat(){ //signatures must match exactly
        super.eat();
        System.out.println("Wolf eats");
        return new Wolf();
    }

    public void hawl(){
        System.out.println("Wolf hawles");

    }

}
