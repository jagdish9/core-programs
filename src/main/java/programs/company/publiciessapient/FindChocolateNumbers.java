package programs.company.publiciessapient;

import java.util.*;

public class FindChocolateNumbers {
    public static void main(String[] args) {
        int N = 10;
        int M = 4;

        Set<Integer> numbers = getChocolateNumbers(N, M);

        numbers.forEach(m -> System.out.print(m + " "));
    }

    private static Set<Integer> getChocolateNumbers(int n, int m) {
        Set<Integer> result = new LinkedHashSet<>();

        int i = 0;

        while(!result.contains(i)) {
            result.add(i);
            i = (i + m) % n;
        }

        return result;
    }
}
