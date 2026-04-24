package programs.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapRequiredToSortArray {
    public static void main(String[] args) {
        int[] arr = {10, 19, 6, 3, 5};
       // int[] arr = {2, 1, 3};
        int swapCount = minimumSwap(arr);
        System.out.println(swapCount);
    }

    private static int minimumSwap(int[] arr) {
        //temporary array to store elements in sorted order
        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> position = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            position.put(arr[i], i);
        }

        int swaps = 0;

        for(int i = 0; i < arr.length; i++) {
            if(temp[i] != arr[i]) {

                int index = position.get(temp[i]);

                int tempValue = arr[i];
                arr[i] = arr[index];
                arr[index] = tempValue;

                //update the indices in the map
                position.put(arr[i], i);
                position.put(arr[index], index);

                swaps++;
            }
        }

        return swaps;
    }
}
