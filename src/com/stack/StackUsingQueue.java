package com.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);
        customStack.push(40);

        System.out.println(customStack.size());
        System.out.println(customStack.top());
        System.out.println(customStack.pop());
        System.out.println(customStack.size());
        System.out.println(customStack.top());
    }
}

class CustomStack {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int data) {
        queue.add(data);
        for(int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public int size() {
        return queue.size();
    }
}
