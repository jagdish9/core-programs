package com.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {5, 3, 1, 2, 4};
        int[] output = sortArray(input);
        for(int j = 0; j < output.length; j++) {
            System.out.print(output[j] + " ");
        }
    }

    private static int[] sortArray(int[] input) {
        int len = input.length;

        for(int i = 0; i < len - 1; i++) {
            for(int j = 0; j < len - i - 1; j++) {
                if(input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }

        return input;
    }
}
