package com.java.training.day1.java_apis;

import com.java.training.day1.building_blocks.Dog;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.util.Arrays.asList;
import static java.util.Collections.sort;

import java.util.List;

public class ArrayListAPI {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList listRaw = new ArrayList();

        listRaw.add(new Dog());
        listRaw.add(3);
        listRaw.add("string");


        Object o = listRaw.get(0);
        if(o instanceof Dog) {
            Dog dog = (Dog) o;
            out.println("Dog instance: "+ dog);
        }
        Object o2 = listRaw.get(2);
        // Dog dog = (Dog) o2; //java.lang.ClassCastException

        list.add(3);
        list.add(33);
        list.add(31);
        list.add(32);
        //list.add("string"); //error

        Integer integer = list.get(0);

        /*
        add(), remove(), set(), contains(), isEmpty(), size(), clear(), equals()
         */
        out.println();
        list.remove(new Integer(3));
        out.println(list);

        list.set(0, 11);
        out.println(list);
        out.println(list.contains(31));

        ArrayList<Integer> copy = new ArrayList<>();
        copy.add(list.get(0));
        copy.add(list.get(2));
        copy.add(list.get(1));
        out.println(list + "" + copy);
        out.println(list.equals(copy));


        sort(list);
        sort(copy);
        out.println("After sorting: " + list.equals(copy));

        Object[] objects = list.toArray();
        Integer[] integers = list.toArray(new Integer[0]);

        List<Integer> integers1 = asList(3, 5, 5, 7);
        out.println(integers1);

        //if(listRaw.get(0) instanceof Dog) {
            out.println("Dog instance name: "+ ((Dog) listRaw.get(0)).name);
        //}

        in.read(new byte[9]);
        int maxValue = MAX_VALUE;
        int minValue = MIN_VALUE;
    }
}
