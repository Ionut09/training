package com.java.training.day2.exceptions;

public class ExampleCheckedException extends Exception { //checked
    public ExampleCheckedException(){
    }
    public ExampleCheckedException(String message){
        super(message);
    }
}
