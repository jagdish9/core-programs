package programs.array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementUsingStack {
    public static void main(String[] args) {
        //int[] arr = {1, 3, 2, 4};
        int[] arr = {6, 8, 0, 1, 3};
        int len = arr.length;
        int[] output = new int[len];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(output, -1);

        int j = len - 1;
        for(int i = len - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                output[j] = stack.peek();
            }

            j--;

            stack.push(arr[i]);
        }

        for(int k = 0; k < len; k++) {
            System.out.print(output[k] + " ");
        }
    }
}
