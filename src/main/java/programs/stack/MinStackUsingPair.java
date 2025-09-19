package programs.stack;

import java.util.Stack;

public class MinStackUsingPair {
    Stack<StackPair> stackPair;

    public MinStackUsingPair() {
        stackPair = new Stack<>();
    }

    public static void main(String[] args) {
        MinStackUsingPair stack = new MinStackUsingPair();
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);

        System.out.println(stack.getMin());
    }

    public void push(int data) {
        int min;
        if(stackPair.isEmpty()) {
            min = data;
        } else {
            min = Math.min(stackPair.peek().value, data);
        }
        stackPair.push(new StackPair(data, min));
    }

    public int pop() {
        StackPair stackPair1 = stackPair.pop();
        return stackPair1.key;
    }

    public int top() {
        return stackPair.peek().key;
    }

    public int getMin() {
        return stackPair.peek().value;
    }
}

class StackPair {
    int key;
    int value;

    public StackPair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
