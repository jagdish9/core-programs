package programs.stc;

public class SpyNumber {

    public static void main(String[] args) {
        int a = 1321;

        int sum = 0;
        int product = 1;

        while(a > 0) {
            int aux = a % 10;
            sum = sum + aux;
            product = product * aux;
            a = a / 10;
        }

        if(product == sum)
            System.out.println("This is spy number");
        else
            System.out.println("This is not spy number");
    }
}
