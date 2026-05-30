package programs.coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumBruteForceApproach {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSumUsingBruteForce(arr);

        result.forEach(System.out::println);
    }

    private static List<List<Integer>> threeSumUsingBruteForce(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }

        return result;
    }
}
