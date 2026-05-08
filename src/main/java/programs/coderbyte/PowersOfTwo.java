package programs.coderbyte;

public class PowersOfTwo {
    public static void main(String[] args) {
        int n = 5;
        int base = 2;
        int output = getPowerOfTwo(n, base);
        int output2 = (int) Math.pow(2, 5);
        System.out.println(output);
        System.out.println(output2);
    }

    private static int getPowerOfTwo(int n, int base) {
        int product = 1;
        if(n >= 1) {
            product *= base;
        }
        for(int i = 2; i <= n; i++) {
            product *= base;
        }

        return product;
    }
}
