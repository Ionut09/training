package com.java.training.day1.building_blocks;


public class FirstMainMethod {

    public static void main(String[] args) {
/*
        System.out.println("Hello " + args[0]);
        Random r = new Random();
        System.out.println(r.nextInt(10));
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);

        Date date = Date.from(Instant.now());
        java.sql.Date date1 = null;
*/
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}

class Chick {
    String name = "Fluffy";

    {
        System.out.println(name + "   setting field");
    }

    public Chick() {

        name = "Tiny";

        System.out.println("setting constructor");
    }
}