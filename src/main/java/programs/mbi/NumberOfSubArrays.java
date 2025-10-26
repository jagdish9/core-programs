package programs.mbi;

public class NumberOfSubArrays {
    public static void main(String[] args) {
        /*int[] arr = {10, 2, -2, -20, 10};
        int k = -10;*/

        /*int[] arr = {9, 4, 20, 3, 10, 5};
        int k = 33;*/

        int[] arr = {1, 3, 5};
        int k = 2;

        int occurence = 0;

        for(int i = 0; i < arr.length; i++) {
            int totalSum = arr[i];
            for(int j = i +1; j < arr.length; j++) {
                totalSum += arr[j];
                if(totalSum == k) {
                    occurence++;
                    break;
                }
            }
        }

        System.out.println(occurence);
    }
}
