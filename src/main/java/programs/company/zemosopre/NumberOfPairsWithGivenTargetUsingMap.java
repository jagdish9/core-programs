package programs.company.zemosopre;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsWithGivenTargetUsingMap {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int num : arr) {
            int diff = target - num;

            if(map.containsKey(diff))
                count += map.get(diff);

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(count);
        System.out.println(map);
    }
}
