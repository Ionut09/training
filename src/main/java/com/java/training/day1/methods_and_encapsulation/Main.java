package com.java.training.day1.methods_and_encapsulation;

public class Main {

    public static void main(String[] args) {
        Student john = new Student();
//        john.name = "JOhn";
//        john.note = -20;

        john.setNote(9);

        ImmutableClass immutableObject = new ImmutableClass(11, new StringBuilder("qwerty"));

        System.out.println(immutableObject);

        immutableObject.getValue();
        StringBuilder objectSb = immutableObject.getSb();
        objectSb.append("123334");

        System.out.println(immutableObject);

    }
}
