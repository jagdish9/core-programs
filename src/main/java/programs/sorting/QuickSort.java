package programs.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = {4, 6, 2, 5, 7, 9, 1, 3};
        System.out.println("Before Sorting array:");
        for(int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }

        System.out.println("\nAfter Sorting array:");
        quickSort(input, 0, input.length - 1);
        for(int j = 0; j < input.length; j++) {
            System.out.print(input[j] + " ");
        }
    }

    private static void quickSort(int[] input, int low, int high) {
        if(low < high) {
            int pIndex = partition(input, low, high);
            quickSort(input, low, pIndex - 1);
            quickSort(input, pIndex + 1, high);
        }
    }

    private static int partition(int[] input, int low, int high) {
        int pivot = input[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(input[i] <= pivot && i <= high - 1) {
                i++;
            }

            while(input[j] > pivot && j >= low + 1) {
                j--;
            }

            if(i < j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        int temp = input[low];
        input[low] = input[j];
        input[j] = temp;

        return j;
    }
}
