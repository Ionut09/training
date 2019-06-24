package com.java.training.day1.operators_statements;

public class Statements {
    public static void main(String[] args) {

        ifStatement(19);
        whileStatement(20);
        forStatementWhiLabels();

    }

    static void forStatementWhiLabels() {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        int[][] arr = new int[3][]; //{nul, null, null}
        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    static void whileStatement(int x) {
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }
    }

    static void ifStatement(int hourOfDay) {
        if (hourOfDay < 12) {
            System.out.println("Good morning!");
        } else if (hourOfDay < 17) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
}
