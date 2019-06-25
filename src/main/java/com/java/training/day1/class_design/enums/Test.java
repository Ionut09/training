package com.java.training.day1.class_design.enums;

import static com.java.training.day1.class_design.enums.Season.*;

public class Test {

    public static void main(String[] args) {
        int ordinal = SPRING.ordinal();
        String winter = SPRING.toString();

        System.out.println(winter + "-->" + ordinal);

        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value.ordinal() + "-->" + value.toString() + " length:" + value.getLength());
        }

        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);


        Season season = AUTUMN;
        switch (season){
            case WINTER:
                System.out.println(WINTER);
                break;
            case SPRING:
                System.out.println(SPRING);
                break;
            case AUTUMN:
                System.out.println(AUTUMN);
                break;
            case SUMMER:
                System.out.println(SUMMER);
                break;
        }
    }
}
