package programs.coderbyte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingApproach2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] indexes = findIndexOfTarget(arr, target);

        Arrays.stream(indexes)
                .forEach(a -> System.out.print(a + " "));
    }

    private static int[] findIndexOfTarget(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }

            map.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }
}
