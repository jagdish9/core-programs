package programs.search;

public class BinarySearchSortedDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10, 1};
        int element = 50;

        BinarySearchSortedDescendingOrder binarySearchSortedDescendingOrder = new BinarySearchSortedDescendingOrder();
        int elementIndex = binarySearchSortedDescendingOrder.getElementIndex(arr, element);

        if(elementIndex == -1)
            System.out.println("Element is not present at index");
        else
            System.out.println("Element is present at index: "+ elementIndex);
    }

    private int getElementIndex(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
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
