package programs.java8revision.common;

public class SingletonDesign {
    private static SingletonDesign singleton = new SingletonDesign();

    private SingletonDesign() {
    }

    public SingletonDesign getSingletonInstance() {
        if(singleton == null) {
            singleton = new SingletonDesign();
        }
        return singleton;
    }
}
