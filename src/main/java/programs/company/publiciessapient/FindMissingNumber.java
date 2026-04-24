package programs.company.publiciessapient;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 1, 2};
        //int[] arr = {1, 2, 3};
        //int[] arr = {-1, -3};

        int misingNumber = getMissingNumber(arr);
        System.out.println(misingNumber);
    }

    private static int getMissingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();

        int smallest = 1;

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Find smallest missing positive
        while (true) {
            if (!set.contains(smallest)) {
                return smallest;
            }
            smallest++;
        }
    }
}

/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }
content_copy

that, given an array A of N integers, returns the smallest positive integer (greater than 0)
 that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
