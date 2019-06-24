package com.java.training.day2.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        String s = "";
        try {
            s += "t";
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.print(s);
    }
}
