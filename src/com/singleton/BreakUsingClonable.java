package com.singleton;

public class BreakUsingClonable {
    public static void main(String[] args) {
        SingletonCloneable singletonCloneable = SingletonCloneable.getInstance();
        print("s1", singletonCloneable);

        SingletonCloneable s3 = singletonCloneable.clone();
        print("s3", s3);
    }

    private static void print(String name, SingletonCloneable singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}

class SingletonCloneable implements Cloneable {
    private static SingletonCloneable soleInstance = new SingletonCloneable();

    private SingletonCloneable() {
        System.out.println("Creating...");
    }

    public static SingletonCloneable getInstance() {
        return soleInstance;
    }

    @Override
    public SingletonCloneable clone() {
        try {
            SingletonCloneable clone = (SingletonCloneable) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
