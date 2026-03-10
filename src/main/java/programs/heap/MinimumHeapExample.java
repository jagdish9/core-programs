package programs.heap;

import java.util.PriorityQueue;

public class MinimumHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);

        System.out.println(minHeap.peek());
    }
}

/*
Default ordering = Natural order (ascending)
So smallest element stays at top.
 */
