package programs.slidingwindow;

import java.util.*;

public class FindFirstNegativeWindowOfSizeKDifferentApproach {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int[] result = getNegativeNumbers(arr, k);
        for(int r : result) {
            System.out.print(r + " ");
        }
    }

    private static int[] getNegativeNumbers(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        int len = arr.length;

        for(int i = 0; i < k; i++) {
            if(arr[i] < 0)
                deque.addLast(i);
        }

        for(int i = k; i < len; i++) {
            if(!deque.isEmpty())
                result.add(arr[deque.peekFirst()]);
            else
                result.add(0);

            // Remove the elements which are out of
            // this window
            while(!deque.isEmpty() && deque.peekFirst() < (i - k + 1))
                deque.pollFirst();

            //add current element if it is negative
            if(arr[i] < 0)
                deque.addLast(i);
        }

        //For the last window, process it separately
        if(!deque.isEmpty())
            result.add(arr[deque.peekFirst()]);
        else
            result.add(0);

        return result.stream().mapToInt(i -> i).toArray();
    }
}
