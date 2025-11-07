package programs.turing;

public class FindSumOfDigits {
    public static void main(String[] args) {
        int n= 9999;
        int digit = getSumOfDigit(n);
        System.out.println(digit);
    }

    private static int getSumOfDigit(int n) {
        int sum = 0;

        while(n > 0 || sum > 9) {
            if(n == 0) {
                n = sum;
                sum = 0;
            }
            sum = sum + n % 10;
            n = n /10;
        }

        return sum;
    }
}
