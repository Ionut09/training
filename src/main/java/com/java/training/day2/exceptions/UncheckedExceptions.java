package com.java.training.day2.exceptions;

import java.util.Scanner;

public class UncheckedExceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar: ");
        String input = scanner.next();
        int inputNumber = 0;
        try{
            inputNumber = Integer.parseInt(input);
            throw new IllegalArgumentException("Unexpected exception"); //throw poate fi folosit doar pt clase care extind Throwable
        }catch (NumberFormatException ex){
            System.out.println("Inputul introdus nu este un numar!");
        }finally {
            //executes no matter what
            System.out.println("finally");
        }
        System.out.println("inputNumber --> " + inputNumber);
    }

    /*
    unchecked: NumberFormatException, NUllPointerException, IllegalArgumentException, java.lang.StringIndexOutOfBoundsException
    java.lang.ClassCastException, java.lang.RuntimeException, java.lang.IllegalStateException

    checked: java.io.IOException, java.io.FileNotFoundException, java.sql.SQLException,
     */
}
