package programs.company.nablepost;

public class PowerOfN {
    public static void main(String[] args) {
        int n = -5;
        int base = 2;
        double multiply = 1;
        int temp = n;
        boolean negative = false;
        if(n < 0) {
            temp = -1 * n;
            negative = true;
        }

        for(int i = 0; i < temp; i++) {
            multiply = multiply * base;
        }

        if(negative) {
            multiply = 1/multiply ;
        }

        System.out.println(multiply);
    }
}
