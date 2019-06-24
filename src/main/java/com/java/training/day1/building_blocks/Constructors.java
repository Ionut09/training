package com.java.training.day1.building_blocks;

public class Constructors {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("sjncdij");
        Dog bobitza = new Dog();

        System.out.println(bobitza.age + " : " + bobitza.name);
        bobitza.age = 2;
        bobitza.name = "Bobitza";

        Dog bobitza1 = new Dog(3, "Bobitza1");
        System.out.println(bobitza1.age + " : " + bobitza1.name);

    }
}
