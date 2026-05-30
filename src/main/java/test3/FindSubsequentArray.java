package test3;

import java.util.ArrayList;
import java.util.List;

public class FindSubsequentArray {

    public static void main(String[] args) {
        //int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 220, 18};

        int[] output = getArray(arr);

        for (int j : output) {
            System.out.print(j + " ");
        }
    }

    private static int[] getArray(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();

        for(int j = 1; j < arr.length; j++) {
            if(arr[i] < arr[j]) {
                list.add(arr[i]);
            }
            i++;
        }

     /*   int[] output = new int[list.size()];
        int k = 0;
        for(Integer eachData : list) {
            output[k] = eachData;
            k++;
        }*/

        return list.stream().mapToInt(l -> l).toArray();
    }
}

//2,3,7,101
