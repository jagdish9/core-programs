package programs.ds;

public class FindGcdOrLcf {
    public static void main(String[] args) {
        String[] input = {"8", "12", "16", "24"};
        int gcd = getGcdUsingEuclidean(input);
        System.out.println(gcd);
    }

    private static int getGcdUsingEuclidean(String[] input) {
        int result = callGcd(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        for(int i = 2; i < input.length; i++) {
            result = callGcd(result, Integer.parseInt(input[i]));
        }
        return result;
    }

    private static int callGcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
