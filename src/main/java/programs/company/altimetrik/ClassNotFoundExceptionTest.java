package programs.company.altimetrik;

public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {
        try {
            Class.forName("programs.character.Pest");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
What it is:
A checked exception
Comes under Exception

When it occurs:
When Java tries to load a class dynamically at runtime but cannot find it
Usually happens when using:
    Class.forName()
    ClassLoader.loadClass()
 */