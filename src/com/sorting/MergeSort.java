package com.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {5, 3, 1, 2, 4};
        System.out.println("Before Sorting array:");
        for(int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        System.out.println("\nAfter Sorting array:");
        mergeSort(input, 0, input.length - 1);
        for(int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
    }

    private static void mergeSort(int[] input, int low, int high) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(input, low, mid);
        mergeSort(input, mid+1, high);
        merge(input, low, mid, high);
    }

    private static void merge(int[] input, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low; // starting index of left half of array
        int right = mid + 1; // starting index of right half of array

        while(left <= mid && right <= high) {
            if(input[left] <= input[right]) {
                temp.add(input[left]);
                left++;
            } else {
                temp.add(input[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(input[left]);
            left++;
        }

        while (right <= high) {
            temp.add(input[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            input[i] = temp.get(i - low);
        }
    }

}
