package programs.singleton;

public class SingletonVerify {
    private static SingletonVerify soleInstance = new SingletonVerify(); // eager initialization

    private SingletonVerify() {
        System.out.println("Creating...");
    }

    public static SingletonVerify getInstance() {
        return soleInstance;
    }
}
