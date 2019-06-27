package com.java.training.day3.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndDequeExamples {

    public static void main(String[] args) {
        //structura de date tipica FIFO
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(6);
        queue.offer(7);
        queue.offer(2);
        queue.offer(4);
        System.out.println(queue);
        System.out.println("peek - " + queue.peek());
        System.out.println(queue);
        System.out.println("poll - " + queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        //structura de date tipica LIFO, dar si FIFO pt ca Deque extinde Queue
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(6);
        System.out.println(stack);

        stack.push(7);
        System.out.println(stack);

        stack.push(2);
        stack.push(4);
        stack.push(10);
        System.out.println(stack);
        System.out.println("pop - "+stack.pop());
        System.out.println("after pop - " + stack);
        System.out.println("poll - "+stack.poll());
        System.out.println("after pop - "+ stack);
    }
}
