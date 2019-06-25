package com.java.training.day1.class_design;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");//referene of type Animal, object of type Animal

        Animal canine = new Canine("dog");//referene of type Animal, object of type Canine

        Animal wolf = new Wolf();//referene of type Animal, object of type Canine

        animal.eat();
        canine.eat(); //dinamic method invocation
        wolf.eat();

        Domestic cat = new Cat("Kitie");

    }
}
