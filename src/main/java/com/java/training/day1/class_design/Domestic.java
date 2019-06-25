package com.java.training.day1.class_design;

public interface Domestic {

    //    public static final int hourToFeed = 14;
//    public static int hourToFeed = 14;
//    public final int hourToFeed = 14;
//    static final int hourToFeed = 14;
//    static int hourToFeed = 14;
//    final int hourToFeed = 14;
    int hourToFeed = 14;

//    public abstract void eats();
//
//    abstract void eats();
//
//    public void eats();

    void eats();

    //public default void sleep(){}
    default void sleep(){
        System.out.println("Domestic animals sleep in a pen");
    }

    static void sleep1(){
        System.out.println("Domestic animals sleep in a pen");
    }

}
