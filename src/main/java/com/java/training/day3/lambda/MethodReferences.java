package com.java.training.day3.lambda;

import com.java.training.day1.class_design.Cat;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {
        //  Cat get();
        Supplier<Cat> pisi = () -> new Cat();
        Supplier<Cat> pisiMethodReference = Cat::new;

        Function<String, Cat> pisiFunction = string -> new Cat(string);
        Function<String, Cat> pisiMethodRefernce = Cat::new;

        //Comparator apply(String t);
        Function<String, Comparator> stringComparatorFunction = str -> Comparator.comparing(Cat::getName);

        Function<String, String> stringFunction = str -> String.format(str);
        Function<String, String> stringMethodRefernce = String::format;

        String string = "A string";
        Function<String, String> stringUpper = str -> str.toUpperCase();
        Function<String, String> stringUpperMethodReference = String::toUpperCase; //getteri

        Function<String, String> stringConcat = stringFromLambdaContext -> string.concat(stringFromLambdaContext);
        Function<String, String> stringConcatMethodReference = string::concat;





    }
}
