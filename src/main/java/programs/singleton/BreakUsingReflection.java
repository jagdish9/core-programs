package programs.singleton;

import java.lang.reflect.Constructor;

public class BreakUsingReflection {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("programs.singleton.SingletonVerify");
        Constructor<SingletonVerify> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonVerify s3 = constructor.newInstance();
        print("s3", s3);
    }

    private static void print(String name, SingletonVerify singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}
