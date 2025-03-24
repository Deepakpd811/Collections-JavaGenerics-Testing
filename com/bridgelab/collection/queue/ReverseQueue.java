package com.bridgelab.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue == null || queue.isEmpty()) {
            return; // Nothing to reverse
        }

        Stack<T> stack = new Stack<>();

        // 1. Dequeue all elements from the queue and push them onto the stack.
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // 2. Pop all elements from the stack and enqueue them back into the queue.
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
