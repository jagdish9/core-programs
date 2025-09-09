package programs.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 3;

        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(arr, x);

        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index: "+ result);
    }

    private int binarySearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == element)
                return mid;

            if(arr[mid] < element)
                low = mid + 1;

            if(arr[mid] > element)
                high = mid - 1;
        }

        return -1;
    }
}

/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Answer: Above question will be solved by Binary Search sorting algorithm
*/
