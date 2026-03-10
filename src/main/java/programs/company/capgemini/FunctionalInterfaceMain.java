package programs.company.capgemini;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface FunctionalInterfaceExample<A, B, C> {
    public void apply(A a, B b);

    default void fun1() {
        System.out.println("This is FI");
    }
}
