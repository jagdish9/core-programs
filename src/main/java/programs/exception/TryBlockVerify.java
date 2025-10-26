package programs.exception;

public class TryBlockVerify {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            divideOperation(a, b);
        } catch(Exception e) {
            System.out.print("division by 0");
        }
    }

    private static void divideOperation(int a, int b) {
        try {
            int c = a /b;
        } finally {
            System.out.print("finally!");
        }
    }
}
