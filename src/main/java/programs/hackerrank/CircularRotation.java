package programs.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularRotation {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        int q = 3;

        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> queries = Arrays.asList(0, 1, 2);
        List<Integer> output = circularArrayRotation(a, k, queries);
        System.out.println(output);
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int n = a.size();
        int effectiveK = k % n;

        for(int queryIndex : queries) {
            int originalIndex = (queryIndex - effectiveK + n) % n;
            list.add(a.get(originalIndex));
        }

        return list;
    }

}
