package programs.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Working");
    }
}

/*
Pros
Thread safe
Prevents reflection attack
Prevents serialization issues
 */
