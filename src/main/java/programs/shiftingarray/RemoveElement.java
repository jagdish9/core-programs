package programs.shiftingarray;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int value = 3;

        Arrays.stream(arr)
                .filter(element -> element != value)
                .forEach(e -> System.out.print(e + " "));

        System.out.println();

        int resultIndex = removeAllOccurrenceOfElement(arr, value);

        for(int i = 0; i < resultIndex; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int removeAllOccurrenceOfElement(int[] arr, int value) {
        int i = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != value) {
                arr[i] = arr[j];
                i++;
            }
        }

        //i is the new length of array
        return i;
    }
}
