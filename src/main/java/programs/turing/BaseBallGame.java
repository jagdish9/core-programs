package programs.turing;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
        String[] arr = {"5", "2", "C", "D", "+"};
        int count = getCalCount(arr);
        System.out.println(count);
    }

    private static int getCalCount(String[] arr) {
        Stack<Integer> queue = new Stack<>();
        int output = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase("C")) {
                queue.pop();
            } else if(arr[i].equalsIgnoreCase("D")) {
                queue.add(queue.peek()*2);
            } else if(arr[i].equalsIgnoreCase("+")) {
                int last = queue.pop();
                int secondLast = queue.pop();
                queue.add(last + secondLast);
                queue.add(secondLast);
                queue.add(last);
            } else {
                queue.add(Integer.parseInt(arr[i]));
            }
        }

        while (!queue.isEmpty()) {
            int q = queue.pop();
            output += q;
        }

        return output;
    }


}
