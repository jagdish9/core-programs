package programs.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(2);
        pq.add(7);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("xyz");
        priorityQueue.add("abc");
        priorityQueue.add("def");
        priorityQueue.add("ghi");

        System.out.println();

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
