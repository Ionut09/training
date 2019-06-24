package com.java.training.day1.building_blocks;

public class Variables {

    public static void main(String[] args) {
        Dog d = new Dog(2, "terry");
        Dog d1 = new Dog(2, "bobi");

        Dog.numberOfLegs = 4;

        System.out.println(d.numberOfLegs);
        System.out.println(d1.numberOfLegs);

        Dog.howManyLegs();
    }
}
