package programs.company.capgemini;

public class FunctionalInterfaceTest2 {
    public static void main(String[] args) {
        FunctionalInterface2 obj = (a, b) -> a + b;

        int result = obj.add(6, 7);
        System.out.println(result);
    }
}

@FunctionalInterface
interface FunctionalInterface2 {
    int add(int a, int b);
}
