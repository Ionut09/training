package com.java.training.day1.class_design;

import java.io.Serializable;

public interface Cabaline extends Domestic, Serializable {

    default void method(){
        sleep();
        System.out.println("");
    }


}
