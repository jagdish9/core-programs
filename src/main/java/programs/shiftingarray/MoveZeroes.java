package programs.shiftingarray;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

       /* int[] result = moveZeroesUsingBruteForce(arr);
        Arrays.stream(result)
                .forEach(value -> System.out.print(value + " "));*/

        System.out.println();

        int[] result2 = moveZeroesUsingTwoPointers(arr);
        Arrays.stream(result2)
                .forEach(h -> System.out.print(h + " "));
    }

    //Time complexity: O(n)
    private static int[] moveZeroesUsingTwoPointers(int[] arr) {
        int i = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        return arr;
    }

    //Time complexity: O(n^2)
    private static int[] moveZeroesUsingBruteForce(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
