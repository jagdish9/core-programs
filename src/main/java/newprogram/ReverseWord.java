package newprogram;

import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hello world! Hello India!";

        Stack<String> stack = new Stack<>();
        str += " ";
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                stack.push(s);
                s = "";
            } else {
                s += str.charAt(i);
            }
        }

        StringBuilder output = new StringBuilder();
        while(!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        System.out.println(output);
    }
}
