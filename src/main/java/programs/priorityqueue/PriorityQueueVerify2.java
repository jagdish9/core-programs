package programs.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueVerify2 {
    public static void main(String[] args) {
        PriorityQueue<String> minHeap = new PriorityQueue<>();
        minHeap.add("Zebra");
        minHeap.add("Jumanji");
        minHeap.add("Anamika");

        System.out.println("Min-Heap: "+ minHeap);

        System.out.println("Removed from Min-Heap: "+ minHeap.poll());
        System.out.println("Removed from Min-Heap: "+ minHeap.peek());

        PriorityQueue<String> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add("Lalika");
        maxHeap.add("Yellowo");
        maxHeap.add("Qubic");
        maxHeap.add("Curz");

        System.out.println();

        System.out.println("Max-Heap: "+maxHeap);

        System.out.println("Removed from Max-Heap: "+ maxHeap.poll());
        System.out.println("Removed from Max-Heap: "+ maxHeap.remove());
        System.out.println("Removed from Max-Heap: "+ maxHeap.peek());

    }
}
