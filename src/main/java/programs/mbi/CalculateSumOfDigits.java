package programs.mbi;

public class CalculateSumOfDigits {
    public static void main(String[] args) {
        int a = 12345;

        int sum = 0;
        while(a > 0) {
            int x = a % 10;
            sum += x;
            a = a / 10;
        }

        System.out.println(sum);
    }
}
