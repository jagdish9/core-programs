package programs.array;

public class MaximumSubArraySumUsingKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int maxSum = arr[0];
        int maxEnd = arr[0];
        int currentStart = 0;
        int startIndex = 0;
        int endIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            maxEnd = maxEnd + arr[i];
            if(arr[i] > maxEnd) {
                maxEnd = arr[i];
                currentStart = i;
            }

            if(maxEnd > maxSum) {
                maxSum = maxEnd;
                startIndex = currentStart;
                endIndex = i;
            }
        }

        System.out.println(maxSum);
        System.out.println("Sub array index: start-"+ startIndex + " and end-" + endIndex);
    }
}
