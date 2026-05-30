package programs.twopointerapproach;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};
        int result = removeDuplicates(arr);

        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if(arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        return slow+1;
    }
}
