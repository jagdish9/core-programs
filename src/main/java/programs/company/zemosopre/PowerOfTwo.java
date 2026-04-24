package programs.company.zemosopre;

public class PowerOfTwo {
    public static void main(String[] args) {
        boolean powerOfTwo = isPowerOfTwo(32);
        System.out.println(powerOfTwo);
    }

    private static boolean isPowerOfTwo(int number) {
        if(number <= 0)
            return false;

        while (number % 2 == 0) {
            number = number / 2;
        }

        return number == 1;
    }
}
