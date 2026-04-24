package programs.company.zemosopre;

import java.util.ArrayList;
import java.util.List;

public class NumberOfPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        List<List<Integer>> pairList = new ArrayList<>();
        int pairCount = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                List<Integer> subList = new ArrayList<>();
                if(arr[i] + arr[j] == target) {
                    pairCount++;
                    subList.add(arr[i]);
                    subList.add(arr[j]);
                }
                if(!subList.isEmpty())
                    pairList.add(subList);
            }
        }

        System.out.println(pairCount);
        System.out.println(pairList);
    }
}
