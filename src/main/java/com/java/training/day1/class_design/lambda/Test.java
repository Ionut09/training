package com.java.training.day1.class_design.lambda;

public class Test {
    public static void main(String[] args) {
        methdodThatAcceptsAInterface(new ObjectThatImplementsInterfataFunctionala());

        methdodThatAcceptsAInterface((String s) -> { System.out.println("print somthing " + s);});
        methdodThatAcceptsAInterface(s -> { System.out.println("print somthing " + s);});

    }



    static void methdodThatAcceptsAInterface(InterfataFunctionala i) {
        i.doSomething(" heavy logic");
    }
}

class ObjectThatImplementsInterfataFunctionala implements InterfataFunctionala {
    @Override
    public void doSomething(String s) {
        System.out.println("print somthing " + s);
    }
}