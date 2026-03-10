package programs.company.nablepost;

public class PowerOfNRecursiveWay {
    public static void main(String[] args) {
        double x = 2;
        int n = -5;

        double result = powerOfN(x, n);
        System.out.println(result);
    }

    private static double powerOfN(double x, int n) {
        if(n == 0)
            return 1;

        if(n < 0) {
            return 1 / powerOfN(x, -n);
        }

        return x * powerOfN(x, n - 1);
    }
}
