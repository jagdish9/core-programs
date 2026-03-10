package programs.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);

        System.out.println(maxHeap.peek());
    }
}

/*
To create Max Heap, you must provide a custom comparator.

✔ Using Collections.reverseOrder()
 */