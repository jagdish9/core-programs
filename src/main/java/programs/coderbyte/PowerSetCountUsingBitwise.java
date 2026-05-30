package programs.coderbyte;

public class PowerSetCountUsingBitwise {
    public static void main(String[] args) {
        int n = 3;

        for(int i = 0; i <= n; i++) {
            int value = 1 << i;
            System.out.println(value);
        }
    }
}
