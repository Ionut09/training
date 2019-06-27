package com.java.training.day4.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExamples {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("heavy job of thread " + Thread.currentThread().getName() + "---"+i);
            }
        };

        ExecutorService service = null;
        try {

            //service = Executors.newFixedThreadPool(8);
            service = Executors.newCachedThreadPool();
            service.submit(runnable);
            service.submit(runnable);
            service.submit(runnable);
            service.submit(runnable);

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        System.out.println("heavy job of thread " + Thread.currentThread().getName());

        ScheduledExecutorService scheduledExecutorService = null;
        try {

            //service = Executors.newFixedThreadPool(8);
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            scheduledExecutorService.scheduleAtFixedRate(runnable, 0, 2, TimeUnit.SECONDS);

        } finally {
//            if (scheduledExecutorService != null) {
//                scheduledExecutorService.shutdown();
//            }
        }
    }
}
