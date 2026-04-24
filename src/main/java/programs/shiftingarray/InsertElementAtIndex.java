package programs.shiftingarray;

import java.util.Arrays;

public class InsertElementAtIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int elementToBeInserted = 3;
        int index = 2;

        int[] result = insertElementAtIndex(arr, elementToBeInserted, index);

        Arrays.stream(result)
                .forEach(k -> System.out.print(k + " "));
    }

    private static int[] insertElementAtIndex(int[] arr, int elementToBeInserted, int index) {
        int[] result = new int[arr.length + 1];

        for(int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        result[index] = elementToBeInserted;

        for(int i = index; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }
}
