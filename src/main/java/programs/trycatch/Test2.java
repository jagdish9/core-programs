package programs.trycatch;

public class Test2 {
    public static int test() {
        try {
            System.out.println("try");
            return 10;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
