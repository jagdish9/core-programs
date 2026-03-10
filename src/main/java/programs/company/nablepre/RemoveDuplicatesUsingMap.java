package programs.company.nablepre;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesUsingMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], 1);
        }

        System.out.println(map.keySet());
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
