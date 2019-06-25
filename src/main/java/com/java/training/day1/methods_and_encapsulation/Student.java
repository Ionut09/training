package com.java.training.day1.methods_and_encapsulation;

public class Student {

    private String name;
    private int note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if(note < 1 || note > 10){
            throw new IllegalArgumentException("The note should be bteween 1 - 10;");
        }
        this.note = note;
    }
}
