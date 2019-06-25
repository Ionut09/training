package com.java.training.day1.methods_and_encapsulation;

public class Overloading {

    private void methodOverloaded(){}
    public void methodOverloaded(int a){}
    void methodOverloaded(Integer i){}
    protected String methodOverloaded(Object o){
        return "";
    }
    protected String methodOverloaded(Number n){
        return "";
    }
    private void methodOverloaded(int a, String s){}
    private int methodOverloaded(int... vars){
        return 2;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.methodOverloaded(3);
        o.methodOverloaded();
        o.methodOverloaded(2L);//in prima faza face boxing la Long
        o.methodOverloaded(1,2);
    }
}
