package programs.queue;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();
        customQueue.push(12);
        customQueue.push(24);
        customQueue.push(36);
        customQueue.push(48);

        System.out.println(customQueue.peek());
        System.out.println(customQueue.size());
        System.out.println(customQueue.pop());
        System.out.println(customQueue.peek());
    }
}

class CustomQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int data) {
        input.add(data);
    }

    public int pop() {
        if(output.isEmpty())
            while (!input.isEmpty()) {
                output.push(input.peek());
                input.pop();
            }

        int x = output.peek();
        output.pop();
        return x;
    }

    public int peek() {
        if(output.isEmpty())
            while (!input.isEmpty()) {
                output.push(input.peek());
                input.pop();
            }

        return output.peek();
    }

    public int size() {
        return output.size() + input.size();
    }
}
