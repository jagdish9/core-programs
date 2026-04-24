package programs.slidingwindow;

import java.util.*;

public class SlidingWindowMaximumDifferentApproach {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};;
        //int[] arr = {1, 3, 2, 1, 7, 3};;
        int k = 3;
        List<Integer> result = getMaximum(arr, k);
        for(int r : result) {
            System.out.print(r + " ");
        }
    }

    private static List<Integer> getMaximum(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        //process first window
        for(int i = 0; i < k; i++) {
            // For every element, the previous smaller elements
            // are useless so remove them from dq
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                //Remove from rear
                deque.pollLast();
            }
            // Add new element at rear of queue
            deque.addLast(i);
        }

        //process rest of the element
        for(int i = k; i < arr.length; i++) {
            // The element at the front of the queue is the largest
            // element of previous window, so store it
            if(!deque.isEmpty())
                result.add(arr[deque.peekFirst()]);

            //Remove which are out of this window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                //Remove from front
                deque.pollFirst();
            }

            // Remove all elements smaller than the currently being
            // added element (remove useless elements)
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.pollLast();
            }

            //Add current element at the rear of the deque
            deque.addLast(i);
        }

        //store maximum element of the last window
        result.add(arr[deque.peekFirst()]);

        return result;
    }
}
