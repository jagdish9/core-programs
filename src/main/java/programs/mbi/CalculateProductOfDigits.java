package programs.mbi;

public class CalculateProductOfDigits {
    public static void main(String[] args) {
        int a = 12345;

        int product = 1;
        while(a > 0) {
            int x = a % 10;
            product *= x;
            a = a / 10;
        }

        System.out.println(product);
    }
}
