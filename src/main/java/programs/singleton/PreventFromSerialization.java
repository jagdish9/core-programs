package programs.singleton;

import java.io.*;

public class PreventFromSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonCheckOnSerialization s1 = SingletonCheckOnSerialization.getInstance();
        print("s1", s1);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Softwares\\work\\ser.txt"));
        objectOutputStream.writeObject(s1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Softwares\\work\\ser.txt"));
        SingletonCheckOnSerialization s2 = (SingletonCheckOnSerialization) objectInputStream.readObject();
        print("s2", s2);
    }

    private static void print(String name, SingletonCheckOnSerialization singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}

class SingletonCheckOnSerialization implements Serializable {
    private static SingletonCheckOnSerialization soleInstance = null;

    private SingletonCheckOnSerialization() {
        System.out.println("Creating...");
    }

    public static SingletonCheckOnSerialization getInstance() {
        if(soleInstance == null)
            soleInstance = new SingletonCheckOnSerialization();
        return soleInstance;
    }

    @Serial
    private Object readResolve() {
        System.out.println("... read resolve ...");
        return soleInstance;
    }
}
