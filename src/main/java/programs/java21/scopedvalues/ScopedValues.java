package programs.java21.scopedvalues;

public class ScopedValues {
    private static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER, "Jackyy")
                .run(() -> {
                    greet();
                });
    }

    static void greet() {
        System.out.println("Hello " + USER.get());
    }
}

/*
This was preview feature in Java 21 and still is preview feature in Java 25
 */

/*
A safer alternative to ThreadLocal.

What problem do Scoped Values solve?

Traditionally, request-specific context is often stored using:

ThreadLocal<User> currentUser = new ThreadLocal<>();

Problems with ThreadLocal:

Mutable state
Potential memory leaks
Hard to reason about in concurrent applications
Not ideal with virtual threads

Scoped Values provide:

Immutable context
Better performance with virtual threads
Safer sharing of contextual data
 */