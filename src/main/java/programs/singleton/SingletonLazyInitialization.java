package programs.singleton;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization soleInstance = null;

    private SingletonLazyInitialization() {
        System.out.println("Creating...");
    }

    public static SingletonLazyInitialization getInstance() {
        if(soleInstance == null) {
            soleInstance = new SingletonLazyInitialization();
        }
        return soleInstance;
    }
}
