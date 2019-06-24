package com.java.training.day1.building_blocks;

public class GarbageCollector {

    public static void main(String[] args) {
        Dog d = new Dog();
        d = new Dog(1, "Bibi"); //first Dog object is now eligible for garbage collection
        d = null;                         //second Dog object (Bibi) is now eligible for garbage collection
    }
}
