package com.java.training.day1.class_design.enums;

public enum Season {
    SPRING(3), SUMMER(4), AUTUMN(3), WINTER(2);
    private int length;
    //0     //1     //2   //3

   // private Season(int length){
    Season(int length){ //private by default
        this.length = length;
    }

    public int getLength(){
        return length;
    }
}
