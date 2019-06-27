package com.java.training.day3.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import static java.util.Comparator.comparing;

public class ComparatorExample {

    @Setter
    @AllArgsConstructor
    @ToString
    static class Dog {
        int age;     //0     variabila de instanta          //2
        public String name;  //null
    }


    public static void main(String[] args) {
//        Comparator<Dog> dogComparator = new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };

        Comparator<Dog> dogComparator = (Dog dog1, Dog dog2) -> {
            return dog1.name.compareTo(dog2.name);
        };
        Comparator<Dog> dogComparator2 = (dog1, dog2) -> dog1.name.compareTo(dog2.name);
        //String apply(Dog d)
        Comparator<Dog> dogComparator3 = comparing((Dog cutu) -> cutu.name);

        Set<Dog> dogs = new TreeSet<>(dogComparator);

        dogs.add(new Dog(2, "Rex"));
        dogs.add(new Dog(2, "Cutu"));
        dogs.add(new Dog(2, "Labus"));

        System.out.println(dogs);
    }
}
