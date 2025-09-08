package com.singleton;

import java.lang.reflect.Constructor;

public class PreventFromReflection {
    public static void main(String[] args) throws Exception {
        SingletonCheckOnConstructor s1 = SingletonCheckOnConstructor.getInstance();
        print("s1", s1);

        Class clazz = Class.forName("com.singleton.SingletonCheckOnConstructor");
        Constructor<SingletonCheckOnConstructor> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonCheckOnConstructor s2 = constructor.newInstance();
        print("s2", s2);
    }

    private static void print(String name, SingletonCheckOnConstructor singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}

class SingletonCheckOnConstructor {
    private static SingletonCheckOnConstructor soleInstance = null;

    private SingletonCheckOnConstructor() {
        if(soleInstance != null) {
            throw new RuntimeException("Cannot create, please use getInstance()");
        }
        System.out.println("Creating...");
    }

    public static SingletonCheckOnConstructor getInstance() {
        if(soleInstance == null)
            soleInstance = new SingletonCheckOnConstructor();
        return soleInstance;
    }
}
