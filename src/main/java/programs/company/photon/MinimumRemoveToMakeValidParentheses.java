package programs.company.photon;

import programs.java8important.HandleDuplicateSalary;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        String input = "a)b(c)d";

        String output = minimumRemoveForValid(input);
        System.out.println(output);

    }

    private static String minimumRemoveForValid(String input) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> removeIndex = new HashSet<>();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {
                stack.push(i);
            } else if(input.charAt(i) == ')') {
                if(!stack.isEmpty())
                    stack.pop(); // matched
                else
                    removeIndex.add(i); //invalid
            }
        }

        // Remaining '(' are invalid
        while (!stack.isEmpty()) {
            removeIndex.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {
            if(!removeIndex.contains(i)) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}
