package programs.shiftingarray;

import java.util.Arrays;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int deleteIndex = 1;

        int[] result = deleteElementAtIndex(arr, deleteIndex);
        Arrays.stream(result)
                .forEach(e -> System.out.print(e + " "));
    }

    private static int[] deleteElementAtIndex(int[] arr, int deleteIndex) {
        int[] result = new int[arr.length - 1];

        for(int i = 0; i < deleteIndex; i++) {
            result[i] = arr[i];
        }

        for(int i = deleteIndex + 1; i < arr.length; i++) {
            result[i-1] = arr[i];
        }

        return result;
    }
}
