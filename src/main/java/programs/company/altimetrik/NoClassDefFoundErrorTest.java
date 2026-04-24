package programs.company.altimetrik;

public class NoClassDefFoundErrorTest {
    public static void main(String[] args) {
        //AA obj = new AA(); // NoClassDefFoundError
        NoClassDefFoundHelper noClassDefFoundHelper = new NoClassDefFoundHelper();
    }
}

class AA {
    static {
        int x = 10 / 0; // Exception in static block
    }
}

/*
What it is:
An Error (unchecked)
Comes under Error → LinkageError

When it occurs:
When the class was present at compile time, but not available at runtime
OR class failed during initialization

Key point:
Class was found earlier, but now JVM cannot load it
 */