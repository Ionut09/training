package com.java.training.day3.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListExamples {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.addFirst("dog");
        animals.addFirst("dog");
        animals.addFirst("dog");
        animals.addFirst("dog");
        animals.addLast("cat");
        String first = animals.getFirst();
        String last = animals.getLast();

        System.out.println(first+":"+last);

        System.out.println(animals);
        // boolean test(T t);
        animals.removeIf((String element) -> {return element.equals("dog");});
        System.out.println(animals);


        System.out.println("=====================================");
        Set<String> students = new TreeSet<>(); //tip de set sortat
        System.out.println(students.add("Diana"));
        System.out.println(students.add("Diana"));
        System.out.println(students.add("Andrei"));
        System.out.println(students.add("Radu"));

        System.out.println(students);

        Set<Student> students1 = new TreeSet<>(); //doar la LinkedHashSet se pastreaza ordinea, nu si la HashSet
                                    //ClassCastException daca clasa adaugata in TreeSet Nu implementeaza java.lang.Comparable
        students1.add(new Student("Andrei", 25));
        students1.add(new Student("Andrei", 25));
        students1.add(new Student("Andrei", 25));
        students1.add(new Student("Andrei", 25));
        students1.add(new Student("Andrei", 25));
        students1.add(new Student("Radu", 25));
        students1.add(new Student("Radu", 25));
        students1.add(new Student("Radu", 25));
        students1.add(new Student("Radu", 25));
        students1.add(new Student("Radu", 25));
        students1.forEach(student -> System.out.println(student));




    }
}
