package programs.trycatch;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int x = 10;

        try {
            return x;
        } finally {
            x = 20;
            System.out.println("finally x: "+x);
        }
    }
}
