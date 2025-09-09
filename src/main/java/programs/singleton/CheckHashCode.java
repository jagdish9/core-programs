package programs.singleton;

public class CheckHashCode {
    public static void main(String[] args) {
        SingletonVerify singletonVerify1 = SingletonVerify.getInstance();
        SingletonVerify singletonVerify2 = SingletonVerify.getInstance();

        print("s1", singletonVerify1);
        print("s2", singletonVerify2);
    }

    private static void print(String name, SingletonVerify singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}
