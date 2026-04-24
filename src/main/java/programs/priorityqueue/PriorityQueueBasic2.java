package programs.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueBasic2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add("x");
        pq.add("a");
        pq.add("z");
        pq.add("d");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
