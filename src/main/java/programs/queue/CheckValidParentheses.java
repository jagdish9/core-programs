package programs.queue;

import java.util.Stack;

public class CheckValidParentheses {
    public static void main(String[] args) {
        String s = "({[}])";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                char c = stack.pop();

                if((ch == ')' && c != '(') ||
                        (ch == '}' && c != '{') ||
                        (ch == ']' && c != '[')) {
                    return  false;
                }
            }
        }

        return stack.isEmpty();
    }
}
