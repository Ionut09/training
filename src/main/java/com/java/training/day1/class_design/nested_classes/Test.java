package com.java.training.day1.class_design.nested_classes;

import com.java.training.day1.class_design.Animal;
import com.java.training.day1.class_design.Feline;
import com.java.training.day1.class_design.lambda.InterfataFunctionala;

public class Test {
    public static void main(String[] args) {
        NestingClass nestingClass = new NestingClass();
        NestingClass.Inner inner = nestingClass.new Inner();

        NestingClass.Nested nested = new NestingClass.Nested();

        InterfataFunctionala i = new InterfataFunctionala() { //clasa anonima care implementeaza InterfataFunctionala
            @Override
            public void doSomething(String s) {
                System.out.println("doSomething");
            }
        };

        Animal feline = new Feline("Kitie") {//clasa anonima care extinde Feline
            @Override
            public void purr() {
                System.out.println("Kitie purrs");
            }
        };

         class ClasaLocala{ //nu poate avea modificatori de acces

        }

        feline.toString();

    }

}
