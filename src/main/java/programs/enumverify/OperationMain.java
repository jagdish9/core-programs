package programs.enumverify;

public class OperationMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(Operation.ADD.apply(a, b));
        System.out.println(Operation.SUBTRACT.apply(a, b));
        System.out.println(Operation.MULTIPLY.apply(a, b));
        System.out.println(Operation.DIVISION.apply(a, b));
    }
}
