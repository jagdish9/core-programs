package programs.algorithm.greedy;

public class MinimumCostToMakeArraySize1ByRemovingLargerOfPairs {
    public static void main(String[] args) {
        //int[] arr = {4, 3, 2};
        int[] arr = {3, 4};
        int minimumCost = getMinimumCostToMakeArraySize1(arr);
        System.out.println(minimumCost);
    }

    private static int getMinimumCostToMakeArraySize1(int[] arr) {
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        // Minimum cost is n-1 multiplied
        // with minimum element.
        return (arr.length - 1) * min;
    }
}
