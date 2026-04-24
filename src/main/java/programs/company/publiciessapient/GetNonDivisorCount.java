package programs.company.publiciessapient;

import java.util.Arrays;

public class GetNonDivisorCount {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 6};

        int[] counts = getNonDivisorCount(arr);

        Arrays.stream(counts)
                .forEach(a -> System.out.print(a + " "));
    }

    private static int[] getNonDivisorCount(int[] arr) {
        int[] result = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if (arr[i] % arr[j] != 0) {
                    count++;
                }
            }
            result[k] = count;
            k++;
        }

        return result;
    }
}
