package com.singleton;

public class PreventFromCloneable {
    public static void main(String[] args) {
        SingletonCheckOnCloneable singletonCloneable = SingletonCheckOnCloneable.getInstance();
        print("s1", singletonCloneable);

        try {
            SingletonCheckOnCloneable s2 = singletonCloneable.clone();
            print("s2", s2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void print(String name, SingletonCheckOnCloneable singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}

class SingletonCheckOnCloneable implements Cloneable {
    private static SingletonCheckOnCloneable soleInstance = null;

    private SingletonCheckOnCloneable() {
        System.out.println("Creating...");
    }

    public static SingletonCheckOnCloneable getInstance() {
        if(soleInstance == null)
            soleInstance = new SingletonCheckOnCloneable();
        return soleInstance;
    }

    @Override
    public SingletonCheckOnCloneable clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
