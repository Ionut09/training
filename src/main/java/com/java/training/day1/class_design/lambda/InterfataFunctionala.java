package com.java.training.day1.class_design.lambda;

@FunctionalInterface
public interface InterfataFunctionala {

    void doSomething(String s);
    static void doSomething1(String s){} //de astea ai voie cate vrei
    default void doSomething2(String s){}
}
