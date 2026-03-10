package programs.company.nablepre;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};

        //Set<Integer> set = new HashSet<>(); // does not follow insertion order
        Set<Integer> set = new LinkedHashSet<>(); // follows insertion order

        for(int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }

        System.out.println(set);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
