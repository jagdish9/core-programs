package programs.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueVerify {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(8);

        System.out.println("Min-Heap: "+ minHeap);

        System.out.println("Removed from Min-Heap: "+ minHeap.poll());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(8);

        System.out.println();

        System.out.println("Max-Heap: "+maxHeap);

        System.out.println("Removed from Max-Heap: "+ maxHeap.poll());

        System.out.println("After removal Max-Heap: "+maxHeap);

        System.out.println("Removed from Max-Heap: "+ maxHeap.poll());

        System.out.println("After removal Max-Heap: "+maxHeap);
    }
}
