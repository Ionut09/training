package com.java.training.day4.concurrency;

public class ThreadExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("heavy job of thread " + Thread.currentThread().getName() + i);
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {

            System.out.println(name + i);
        }

        Thread t2 = new CustomThread();
        t2.start();
    }

    static class CustomThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("extended thread " + Thread.currentThread().getName() + i);
            }
        }
    }
}
