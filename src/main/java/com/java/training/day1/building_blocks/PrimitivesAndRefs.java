package com.java.training.day1.building_blocks;

public class PrimitivesAndRefs {
    public static void main(String[] args) {
        int a = 4;
        long x = a;
        long y = 823479832498237928L;

        int z = (int)y;

        float s = 2.3F;
        double d = s;

        int q = 7;
        q++;
        Dog dog = new Dog();
        dog.name = "";
        dog.methodInDog();
    }
}
