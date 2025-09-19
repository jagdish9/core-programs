package programs.stack;

import java.util.Stack;

public class MinStackUsingAuxiliaryStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        MinStackUsingAuxiliaryStack stack = new MinStackUsingAuxiliaryStack();
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);

        System.out.println(stack.getMin());
    }

    public void push(int data) {
        mainStack.push(data);

        if(minStack.isEmpty() || data <= minStack.peek()) {
            minStack.push(data);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public int pop() {
        if(mainStack.isEmpty())
            return -1;

        int poppedData = mainStack.pop();
        minStack.pop();
        return poppedData;
    }

    public int peek() {
        if(mainStack.isEmpty())
            return -1;
        return mainStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public int getMin() {
        if(minStack.isEmpty())
            return -1;

        return minStack.peek();
    }
}
