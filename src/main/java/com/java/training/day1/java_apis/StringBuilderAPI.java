package com.java.training.day1.java_apis;

public class StringBuilderAPI {

    public static void main(String[] args) {
        /*
        charAt(), indexOf(), length(), substring(), append(), insert(), delete(),
        deleteCharAt(), reverse(), toString()
         */
        StringBuilder sb = new StringBuilder("Dog");
        sb.append(1);
        sb.insert(2, "og");
        System.out.println(sb.toString());

        sb.delete(3, 5);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);

        System.out.println(new StringBuilder("qwerty").reverse());
    }
}
