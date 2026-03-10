package programs.company.nablepre;

public class BinarySearchRecursiveWay {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int search = 12;
        int len = arr.length;
        int index = binarySearchCustom(0, len, arr, search);

        System.out.println(index);
    }

    private static int binarySearchCustom(int low, int end, int[] arr, int element) {
        int mid = low + end / 2;
        if(arr[mid] == element) {
            return mid;
        } else if (element < arr[mid]) {
            return binarySearchCustom(0, mid - 1, arr, element);
        } else {
            return binarySearchCustom(mid + 1, end, arr, element);
        }
    }
}

/*
Time Complexity: O(logn)
Space Complexity: O(logn)
 */
