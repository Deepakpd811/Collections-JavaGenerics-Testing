package com.bridgelab.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        // Move all elements from queue1 to queue2.
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // Add the new element to queue1.
        queue1.offer(x);

        // Move all elements back from queue2 to queue1.
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    public int pop() {
        if (queue1.isEmpty()) {
            return -1; // Or throw an exception for empty stack
        }
        return queue1.poll();
    }

    public int top() {
        if (queue1.isEmpty()) {
            return -1; // Or throw an exception for empty stack
        }
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Top: " + stack.top()); // Output: 2
        System.out.println("Pop: " + stack.pop()); // Output: 2
        System.out.println("Pop: " + stack.pop()); // Output: 1
        System.out.println("Empty: " + stack.empty()); // Output: true

    }
}