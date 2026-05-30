package programs.trycatch;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        try {
            System.out.println("try");
            return 10;
        } finally {
            System.out.println("finally");
            return 20;
        }
    }
}
