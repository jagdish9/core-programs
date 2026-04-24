package programs.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();


    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(5);
        medianFinder.addNum(15);
        medianFinder.addNum(1);
        medianFinder.addNum(3);

        System.out.println(medianFinder.findMedian());
    }

    private double findMedian() {
        if(left.size() > right.size())
            return left.peek();

        return (left.peek() + right.peek()) / 2.0;
    }

    private void addNum(int num) {
        left.add(num);
        right.add(left.poll());

        if(left.size() < right.size()) {
            left.add(right.poll());
        }
    }
}
