package programs.company.optimumforpaypalclient;

public class SplitArrayInto2SubArrayWithEqualSum {
    public static void main(String[] args) {
        //int[] arr = {2, 4, 6, 10, 2};
        int[] arr = {1, 2, 3, 3, 2, 1};

        printFirstAndSecondArray(arr);
    }

    private static void printFirstAndSecondArray(int[] arr) {
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }

        int prefixSum = 0;

        for(int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if(prefixSum == (sum - prefixSum)) {
                System.out.println("First array");
                for(int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("\nSecond array");
                for(int k = i + 1; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
            }
        }
    }
}
