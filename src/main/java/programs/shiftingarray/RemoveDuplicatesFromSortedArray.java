package programs.shiftingarray;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};

        int newLength = removeDuplicatesFromArray(arr);

        for(int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicatesFromArray(int[] arr) {
        int i = 0;

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}
