package programs.company.zemosopre;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean permutation = isPermutation(s1, s2);
        System.out.print(permutation);

        String s3 = "Debit Card";
        String s4 = "Bad Credit";

        System.out.println();

        boolean p = checkCaseInsensitive(s1, s2);
        System.out.print(p);
    }

    private static boolean checkCaseInsensitive(String s1, String s2) {
        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();

        if(s1.length() != s2.length())
            return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    private static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
