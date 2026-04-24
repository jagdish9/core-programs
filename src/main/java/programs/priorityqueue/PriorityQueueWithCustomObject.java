package programs.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithCustomObject {
    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>(
                Comparator.comparingInt(a -> a.priority));

        pq.add(new Task(3, "Low"));
        pq.add(new Task(1, "High"));
        pq.add(new Task(2, "Medium"));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }
}

class Task {
    public int priority;
    public String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}
