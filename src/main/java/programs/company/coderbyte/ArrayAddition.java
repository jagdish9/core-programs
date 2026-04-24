package programs.company.coderbyte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayAddition {
    public static void main(String[] args) {
        //int[] arr = {5, 7, 16, 1, 2};
        int[] arr = {3, 5, -1, 8, 12};
        boolean possible = arrayAddition(arr);
        System.out.println(possible);
    }

    private static boolean arrayAddition(int[] arr) {
        Arrays.sort(arr);
        int largestElement = arr[arr.length - 1];
        int[] remArr = Arrays.copyOf(arr, arr.length - 1);

        Set<Integer> sum = new HashSet<>();
        sum.add(0);

        for(int eachNum : remArr) {
            Set<Integer> newSum = new HashSet<>(sum);

            for(int oldNum : sum) {
                int temp = oldNum + eachNum;
                if(temp == largestElement)
                    return true;
                newSum.add(temp);
            }

            sum = newSum;
        }

        return false;
    }
}
