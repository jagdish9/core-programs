package programs.ds;

public class LongestCommonFactor {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        //int lcf = getLCF(a, b);
        int lcf = getLCFUsingEuclidean(a, b);
        System.out.println(lcf);
    }

    private static int getLCFUsingEuclidean(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    private static int getLCF(int a, int b) {
        int lcf = 0;
        for(int i = 1; i < a && i < b; i++) {
            if(a % i == 0 && b % i == 0) {
                lcf = i;
            }
        }

        return lcf;
    }
}
