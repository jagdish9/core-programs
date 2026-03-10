package programs.company.capgemini;

public class FunctionalInterfaceTest1 {
    public static void main(String[] args) {
        FunctionalInterface1 fn = (name) -> {
            System.out.println("Hello "+ name);
        };

        fn.sayHello("Ankit");
    }
}

@FunctionalInterface
interface FunctionalInterface1 {
    void sayHello(String name);
}
