package com.java.training.day3.generics;

public class GenericClass<T>{
    private T t;

    public T genericMethod(){
        return t;
    }

     <R> R methodThatReturnsGeneric(R r){
        return r;
    }

}
