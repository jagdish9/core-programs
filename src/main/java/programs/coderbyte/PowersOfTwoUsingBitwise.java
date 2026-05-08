package programs.coderbyte;

public class PowersOfTwoUsingBitwise {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 0; i <= n; i++) {
            int value = 1 << i;
            System.out.println("2^" + i + " = " + value);
        }
    }
}
