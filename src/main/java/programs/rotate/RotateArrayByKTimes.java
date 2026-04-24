package programs.rotate;

import programs.company.wekan.RotateArray;

import java.util.Arrays;

public class RotateArrayByKTimes {
    public static void main(String[] args) {
        RotateArrayByKTimes rotateArray = new RotateArrayByKTimes();

        int[] input = {1, 2, 3};
        int k = 6;

        rotateArray.printArray(input);
        int[] output = rotateArray.rotateArray(input, k);
        rotateArray.printArray(output);
    }

    private void printArray(int[] input) {
        for(int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private int[] rotateArray(int[] arr, int k) {
        int[] output = Arrays.copyOf(arr, arr.length);
        if(k > arr.length)
            k = k % arr.length;

        while(k != 0) {
            for(int i = 0; i < output.length - 1; i++) {
                int tmp = output[i];
                output[i] = output[i+1];
                output[i+1] = tmp;
            }
            k--;
        }

        return output;
    }
}
