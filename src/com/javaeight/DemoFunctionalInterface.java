package com.javaeight;

@FunctionalInterface
public interface DemoFunctionalInterface {
    // Abstract method
    void myMethod();

    // Default methods (optional)
    default void defaultMethod() {
        // method implementation
    }

    // Static methods (optional)
    static void staticMethod() {
        // method implementation
    }

    // Abstract methods from Object class (not counted toward functional interface method count)
    boolean equals(Object obj);
    int hashCode();
    String toString();
}

