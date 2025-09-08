package com.singleton;

import java.io.*;

public class BreakUsingSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerialization singletonVerify1 = SingletonSerialization.getInstance();
        print("s1", singletonVerify1);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Softwares\\work\\ser.txt"));
        objectOutputStream.writeObject(singletonVerify1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Softwares\\work\\ser.txt"));
        SingletonSerialization s2 = (SingletonSerialization) objectInputStream.readObject();
        print("s2", s2);
    }

    private static void print(String name, SingletonSerialization singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}

class SingletonSerialization implements Serializable {
    private static SingletonSerialization soleInstance = new SingletonSerialization();

    private SingletonSerialization() {
        System.out.println("Creating...");
    }

    public static SingletonSerialization getInstance() {
        return soleInstance;
    }
}
