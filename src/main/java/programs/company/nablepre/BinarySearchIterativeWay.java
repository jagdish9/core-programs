package programs.company.nablepre;

public class BinarySearchIterativeWay {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int element = 12;

        int index = binarySearchIterative(arr, element);
        System.out.println(index);
    }

    private static int binarySearchIterative(int[] arr, int element) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + end / 2;

            if(arr[mid] == element)
                return mid;
            else if(element < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }
}

/*
Time Complexity: O(logn)
Space Complexity: O(1)
 */
