package programs.priorityqueue;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;

        List<Integer> topFrequent = getTopKFrequent(arr, k);

        System.out.println(topFrequent);
    }

    private static List<Integer> getTopKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for(int key : map.keySet()) {
            pq.add(key);

            if(pq.size() > k)
                pq.poll();
        }

        return new ArrayList<>(pq);
    }
}
