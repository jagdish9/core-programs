package programs.shiftingarray;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int[] result = mergeSortedArray(nums1, nums2);

        Arrays.stream(result)
                .forEach(e -> System.out.print(e + " "));
    }

    private static int[] mergeSortedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[n+m];

        int i = 0, j = 0, k = 0;

        while(i < n && j < m) {
            if(nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                k++;
                i++;
            } else {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i < n) {
            result[k] = nums1[i];
            k++;
            i++;
        }

        while(j < m) {
            result[k] = nums2[j];
            k++;
            j++;;
        }

        return result;
    }
}
