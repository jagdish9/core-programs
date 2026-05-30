package programs.coderbyte;

import java.util.Arrays;

public class WaveSort {
    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};

        waveSort(arr);

        Arrays.stream(arr)
                .forEach(a -> System.out.print(a + " "));
    }

    private static void waveSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i += 2) {

            //if previous element is greater then swap
            if(i > 0 && arr[i-1] > arr[i]) {
                swapToSort(arr, i-1, i);
            }

            //if next element is greater then swap
            if(i < n -1 && arr[i+1] > arr[i]) {
                swapToSort(arr, i+1, i);
            }
        }
    }

    private static void swapToSort(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
Approach 1:
Should be:
arr[i] >= arr[i-1]
arr[i] >= arr[i+1]
 */