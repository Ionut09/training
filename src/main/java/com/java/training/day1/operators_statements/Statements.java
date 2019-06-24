package com.java.training.day1.operators_statements;

public class Statements {
    public static void main(String[] args) {
        byte a = 3, b = 2;
        byte sum = (byte) (a + b); //rezultatul operatiei a 2 nre intregi e un int
        int i = 1;
        int j = 1;
        i++;
        System.out.println(i);
        System.out.println(++j);
        Integer q;
        Long l;

        System.out.println(a / b); //rezultatul operatiei a 2 nre intregi e un int
        System.out.println(a / 2.0);
        System.out.println((double) a / b);
//
//        ifStatement("dibasdjbalskj");
//        switchStatement("test");
//        whileStatement("jdsahkjks=======");
//        forStatement("qwertyuio");
    }

    static void ifStatement(String input) {
        if (input.length() > 5) {
            System.out.println("is big");
        } else if (input.length() < 5 && input.length() > 2) {
            System.out.println(" is midle");
        } else {
            System.out.println("is small");
        }
    }

    static void switchStatement(String input) {
        final String test = "test"; //tb sa fie final
        switch (input) { //putem folosi tipuri intregi, boolean, String, si enums
            case test:
                System.out.println("test case");
                break;

            case "ctest":
                System.out.println("ctest case");
                break;

            case "itest":
                System.out.println("itest case");
                break;

            case "dtest":
                System.out.println("dtest case");
                break;

            default:
                System.out.println("default");

        }
    }

    static void whileStatement(String input) {
        String copy = input;
        while (input.length() != 0) {
            int index = input.length() - 1;
            System.out.println(input.charAt(index));
            input = input.substring(0, index);
        }

        do {
            int index = copy.length() - 1;
            System.out.println(copy.charAt(index));
            copy = copy.substring(0, index);
        } while (copy.length() != 0);
    }

    static void forStatement(String input) {
        char[] array = input.toCharArray();
        int[] arrayDef = new int[8];//{0,0,....}
        int arrayDef1[] = new int[8];//{0,0,....}

        BUCLA_MARE:
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            BUCLA_MICA:
            for (char temp : array) {
                System.out.println(temp);
                if (temp == 'a') {
                    continue BUCLA_MARE;
                }
            }
        }


    }
}