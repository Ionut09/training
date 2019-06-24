package com.java.training.day1.java_apis;

import java.util.Arrays;

public class ArraysOperations {

    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 9, 4};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array)); //[1, 3, 4, 9]
        for (int elem : array) {
            System.out.println(elem);
        }

        int indexOf9 = Arrays.binarySearch(array, 9);
        System.out.println(indexOf9);//2
        int indexOf10 = Arrays.binarySearch(array, 10);//-5
        System.out.println(indexOf10);
        int indexOf2 = Arrays.binarySearch(array, 2);//-2
        System.out.println(indexOf2);

        methodWithVarArgs(array); //{3, 1, 9, 4}
        methodWithVarArgs(2); //{2}
        //methodWithVarArgs(); //{} //ArrayIndexOutOfBoundsException
        methodWithVarArgs(2,3,4,5,6); //{2,3,4,5,6}
    }

    static void methodWithVarArgs(int... varargs) {
        varargs[0] = 1;
        for (int elem : varargs) {
            System.out.println("methodWithVarArgs --> "+elem);
        }
    }
}
