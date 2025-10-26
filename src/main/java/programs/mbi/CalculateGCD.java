package programs.mbi;

public class CalculateGCD {
    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        int gcd = getGcd(a, b);
        System.out.println(gcd);
    }

    private static int getGcd(int a, int b) {
        if(a == 0)
            return b;

        if(b == 0)
            return a;

        if(a == b)
            return a;

        if(a > b)
            return getGcd(a - b, b);

        return getGcd(a, b - a);
    }
}
