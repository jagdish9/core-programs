package programs.company.photon;

import java.util.Stack;

public class RemoveStarUsingStack {
    public static void main(String[] args) {
        String input = "\"leetc**de*\"";

        String output = removeStar(input);

        System.out.println(output);
    }

    private static String removeStar(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(char c : input.toCharArray()) {
            if(c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for(char c : stack) {
            stringBuilder.append(c);
        }

        /*while (!stack.isEmpty())
            stringBuilder.append(stack.pop());*/

        return stringBuilder.toString();
    }
}
